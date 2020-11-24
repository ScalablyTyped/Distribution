package typings.storybookApi.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagerConsumerProps[P] extends js.Object {
  
  var children: FunctionComponent[P] | ReactNode = js.native
  
  var filter: js.UndefOr[js.Function1[/* combo */ Combo, P]] = js.native
}
object ManagerConsumerProps {
  
  @scala.inline
  def apply[P](): ManagerConsumerProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagerConsumerProps[P]]
  }
  
  @scala.inline
  implicit class ManagerConsumerPropsOps[Self <: ManagerConsumerProps[_], P] (val x: Self with ManagerConsumerProps[P]) extends AnyVal {
    
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
    def setChildren(value: FunctionComponent[P] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFilter(value: /* combo */ Combo => P): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
