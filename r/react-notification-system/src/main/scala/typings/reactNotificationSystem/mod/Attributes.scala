package typings.reactNotificationSystem.mod

import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends ClassAttributes[System] {
  
  var allowHTML: js.UndefOr[Boolean] = js.native
  
  var noAnimation: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[Style | Boolean] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setAllowHTML(value: Boolean): Self = this.set("allowHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHTML: Self = this.set("allowHTML", js.undefined)
    
    @scala.inline
    def setNoAnimation(value: Boolean): Self = this.set("noAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAnimation: Self = this.set("noAnimation", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
