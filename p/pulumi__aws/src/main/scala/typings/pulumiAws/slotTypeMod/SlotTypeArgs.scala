package typings.pulumiAws.slotTypeMod

import typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotTypeArgs extends js.Object {
  
  /**
    * Determines if a new slot type version is created when the initial resource is created and on each
    * update. Defaults to `false`.
    */
  val createVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A description of the slot type. Must be less than or equal to 200 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of EnumerationValue objects that defines the values that
    * the slot type can take. Each value can have a list of synonyms, which are additional values that help
    * train the machine learning model about the values that it resolves for a slot. Attributes are
    * documented under enumeration_value.
    */
  val enumerationValues: Input[js.Array[Input[SlotTypeEnumerationValue]]] = js.native
  
  /**
    * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Determines the slot resolution strategy that Amazon Lex
    * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
    * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
    * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
    */
  val valueSelectionStrategy: js.UndefOr[Input[String]] = js.native
}
object SlotTypeArgs {
  
  @scala.inline
  def apply(enumerationValues: Input[js.Array[Input[SlotTypeEnumerationValue]]]): SlotTypeArgs = {
    val __obj = js.Dynamic.literal(enumerationValues = enumerationValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeArgs]
  }
  
  @scala.inline
  implicit class SlotTypeArgsOps[Self <: SlotTypeArgs] (val x: Self) extends AnyVal {
    
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
    def setEnumerationValuesVarargs(value: Input[SlotTypeEnumerationValue]*): Self = this.set("enumerationValues", js.Array(value :_*))
    
    @scala.inline
    def setEnumerationValues(value: Input[js.Array[Input[SlotTypeEnumerationValue]]]): Self = this.set("enumerationValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVersion(value: Input[Boolean]): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValueSelectionStrategy(value: Input[String]): Self = this.set("valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSelectionStrategy: Self = this.set("valueSelectionStrategy", js.undefined)
  }
}
