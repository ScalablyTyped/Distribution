package typings.reactFns.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedRenderProps[P] extends js.Object {
  
  var children: js.UndefOr[(js.Function1[/* props */ P, ReactNode]) | ReactNode] = js.native
  
  var component: js.UndefOr[ComponentType[P | Unit]] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var render: js.UndefOr[js.Function1[/* props */ P, ReactNode]] = js.native
}
object SharedRenderProps {
  
  @scala.inline
  def apply[P](): SharedRenderProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedRenderProps[P]]
  }
  
  @scala.inline
  implicit class SharedRenderPropsOps[Self <: SharedRenderProps[_], P] (val x: Self with SharedRenderProps[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ P => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ P, ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[P | Unit]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setRender(value: /* props */ P => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
