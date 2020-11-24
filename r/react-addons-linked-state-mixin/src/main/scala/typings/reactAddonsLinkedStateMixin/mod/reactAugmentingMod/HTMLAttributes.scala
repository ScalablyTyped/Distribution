package typings.reactAddonsLinkedStateMixin.mod.reactAugmentingMod

import typings.reactAddonsLinkedStateMixin.mod.ReactLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAttributes[T] extends js.Object {
  
  var checkedLink: js.UndefOr[ReactLink[Boolean]] = js.native
  
  var valueLink: js.UndefOr[ReactLink[Boolean | String | Double]] = js.native
}
object HTMLAttributes {
  
  @scala.inline
  def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes[_], T] (val x: Self with HTMLAttributes[T]) extends AnyVal {
    
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
    def setCheckedLink(value: ReactLink[Boolean]): Self = this.set("checkedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedLink: Self = this.set("checkedLink", js.undefined)
    
    @scala.inline
    def setValueLink(value: ReactLink[Boolean | String | Double]): Self = this.set("valueLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLink: Self = this.set("valueLink", js.undefined)
  }
}
