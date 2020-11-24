package typings.reactModal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aria extends js.Object {
  
  /** Identifies the element (or elements) that describes the object. */
  var describedby: js.UndefOr[String] = js.native
  
  /** Defines a string value that labels the current element. */
  var labelledby: js.UndefOr[String] = js.native
  
  /** Indicates whether an element is modal when displayed. */
  var modal: js.UndefOr[Boolean] = js.native
}
object Aria {
  
  @scala.inline
  def apply(): Aria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aria]
  }
  
  @scala.inline
  implicit class AriaOps[Self <: Aria] (val x: Self) extends AnyVal {
    
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
    def setDescribedby(value: String): Self = this.set("describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribedby: Self = this.set("describedby", js.undefined)
    
    @scala.inline
    def setLabelledby(value: String): Self = this.set("labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelledby: Self = this.set("labelledby", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
  }
}
