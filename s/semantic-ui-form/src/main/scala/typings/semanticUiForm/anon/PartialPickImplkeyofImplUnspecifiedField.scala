package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplUnspecifiedField extends js.Object {
  
  var unspecifiedField: js.UndefOr[String] = js.native
  
  var unspecifiedRule: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplUnspecifiedField {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplUnspecifiedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplUnspecifiedField]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplUnspecifiedFieldOps[Self <: PartialPickImplkeyofImplUnspecifiedField] (val x: Self) extends AnyVal {
    
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
    def setUnspecifiedField(value: String): Self = this.set("unspecifiedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnspecifiedField: Self = this.set("unspecifiedField", js.undefined)
    
    @scala.inline
    def setUnspecifiedRule(value: String): Self = this.set("unspecifiedRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnspecifiedRule: Self = this.set("unspecifiedRule", js.undefined)
  }
}
