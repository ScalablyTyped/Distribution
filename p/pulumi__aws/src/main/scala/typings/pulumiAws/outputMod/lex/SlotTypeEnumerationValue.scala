package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotTypeEnumerationValue extends js.Object {
  
  /**
    * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The value of the slot type. Must be less than or equal to 140 characters in length.
    */
  var value: String = js.native
}
object SlotTypeEnumerationValue {
  
  @scala.inline
  def apply(value: String): SlotTypeEnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeEnumerationValue]
  }
  
  @scala.inline
  implicit class SlotTypeEnumerationValueOps[Self <: SlotTypeEnumerationValue] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = this.set("synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
  }
}
