package typings.pulumiAws.slotTypeMod

import typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotTypeState extends js.Object {
  
  /**
    * Checksum identifying the version of the slot type that was created. The checksum is
    * not included as an argument because the resource will add it automatically when updating the slot type.
    */
  val checksum: js.UndefOr[Input[String]] = js.native
  
  /**
    * Determines if a new slot type version is created when the initial resource is created and on each
    * update. Defaults to `false`.
    */
  val createVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The date when the slot type version was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
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
  val enumerationValues: js.UndefOr[Input[js.Array[Input[SlotTypeEnumerationValue]]]] = js.native
  
  /**
    * The date when the `$LATEST` version of this slot type was updated.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  
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
  
  /**
    * The version of the slot type.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object SlotTypeState {
  
  @scala.inline
  def apply(): SlotTypeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeState]
  }
  
  @scala.inline
  implicit class SlotTypeStateOps[Self <: SlotTypeState] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: Input[String]): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setCreateVersion(value: Input[Boolean]): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnumerationValuesVarargs(value: Input[SlotTypeEnumerationValue]*): Self = this.set("enumerationValues", js.Array(value :_*))
    
    @scala.inline
    def setEnumerationValues(value: Input[js.Array[Input[SlotTypeEnumerationValue]]]): Self = this.set("enumerationValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumerationValues: Self = this.set("enumerationValues", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValueSelectionStrategy(value: Input[String]): Self = this.set("valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSelectionStrategy: Self = this.set("valueSelectionStrategy", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
