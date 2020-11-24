package typings.pulumiAws.getSlotTypeMod

import typings.pulumiAws.outputMod.lex.GetSlotTypeEnumerationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSlotTypeResult extends js.Object {
  
  /**
    * Checksum identifying the version of the slot type that was created. The checksum is
    * not included as an argument because the resource will add it automatically when updating the slot type.
    */
  val checksum: String = js.native
  
  /**
    * The date when the slot type version was created.
    */
  val createdDate: String = js.native
  
  /**
    * A description of the slot type.
    */
  val description: String = js.native
  
  /**
    * A set of EnumerationValue objects that defines the values that
    * the slot type can take. Each value can have a set of synonyms, which are additional values that help
    * train the machine learning model about the values that it resolves for a slot.
    */
  val enumerationValues: js.Array[GetSlotTypeEnumerationValue] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The date when the $LATEST version of this slot type was updated.
    */
  val lastUpdatedDate: String = js.native
  
  /**
    * The name of the slot type. The name is not case sensitive.
    */
  val name: String = js.native
  
  /**
    * Determines the slot resolution strategy that Amazon Lex
    * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
    * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
    * if there is a resolution list for the slot, otherwise null is returned.
    */
  val valueSelectionStrategy: String = js.native
  
  /**
    * The version of the slot type.
    */
  val version: js.UndefOr[String] = js.native
}
object GetSlotTypeResult {
  
  @scala.inline
  def apply(
    checksum: String,
    createdDate: String,
    description: String,
    enumerationValues: js.Array[GetSlotTypeEnumerationValue],
    id: String,
    lastUpdatedDate: String,
    name: String,
    valueSelectionStrategy: String
  ): GetSlotTypeResult = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enumerationValues = enumerationValues.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], valueSelectionStrategy = valueSelectionStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeResult]
  }
  
  @scala.inline
  implicit class GetSlotTypeResultOps[Self <: GetSlotTypeResult] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerationValuesVarargs(value: GetSlotTypeEnumerationValue*): Self = this.set("enumerationValues", js.Array(value :_*))
    
    @scala.inline
    def setEnumerationValues(value: js.Array[GetSlotTypeEnumerationValue]): Self = this.set("enumerationValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: String): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSelectionStrategy(value: String): Self = this.set("valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
