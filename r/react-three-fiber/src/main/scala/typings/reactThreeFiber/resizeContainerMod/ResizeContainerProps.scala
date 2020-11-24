package typings.reactThreeFiber.resizeContainerMod

import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeContainerProps extends ContainerProps {
  
  var effects: js.UndefOr[
    js.Function2[/* renderer */ js.Any, /* parent */ HTMLDivElement, js.Function0[_]]
  ] = js.native
  
  var preRender: js.UndefOr[ReactNode] = js.native
  
  def renderer(): js.UndefOr[Renderer | Null] = js.native
}
object ResizeContainerProps {
  
  @scala.inline
  def apply(renderer: () => js.UndefOr[Renderer | Null]): ResizeContainerProps = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction0(renderer))
    __obj.asInstanceOf[ResizeContainerProps]
  }
  
  @scala.inline
  implicit class ResizeContainerPropsOps[Self <: ResizeContainerProps] (val x: Self) extends AnyVal {
    
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
    def setRenderer(value: () => js.UndefOr[Renderer | Null]): Self = this.set("renderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEffects(value: (/* renderer */ js.Any, /* parent */ HTMLDivElement) => js.Function0[_]): Self = this.set("effects", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setPreRender(value: ReactNode): Self = this.set("preRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
  }
}
