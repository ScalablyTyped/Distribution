package typings.reactAriaModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleText'> */
@js.native
trait PickAriaModalPropstitleTe extends js.Object {
  
  var titleText: js.UndefOr[String] = js.native
}
object PickAriaModalPropstitleTe {
  
  @scala.inline
  def apply(): PickAriaModalPropstitleTe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAriaModalPropstitleTe]
  }
  
  @scala.inline
  implicit class PickAriaModalPropstitleTeOps[Self <: PickAriaModalPropstitleTe] (val x: Self) extends AnyVal {
    
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
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
  }
}
