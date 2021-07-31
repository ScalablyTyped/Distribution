package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunAutomationDetails extends StObject {
  
  /**
    * A stable, unique identifier for the equivalence class of runs to which this object's containing run object
    * belongs in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the identity and role played within the engineering system by this object's containing run
    * object.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * A stable, unique identifer for this object's containing run object in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * A hierarchical string that uniquely identifies this object's containing run object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the run automation details.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object RunAutomationDetails {
  
  @scala.inline
  def apply(): RunAutomationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAutomationDetails]
  }
  
  @scala.inline
  implicit class RunAutomationDetailsMutableBuilder[Self <: RunAutomationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationGuid(value: String): Self = StObject.set(x, "correlationGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationGuidUndefined: Self = StObject.set(x, "correlationGuid", js.undefined)
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
