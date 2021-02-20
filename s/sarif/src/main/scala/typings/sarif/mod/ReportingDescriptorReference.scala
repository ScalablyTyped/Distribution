package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingDescriptorReference extends StObject {
  
  /**
    * A guid that uniquely identifies the descriptor.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * The id of the descriptor.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors,
    * or toolComponent.taxonomyDescriptors, depending on context.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A reference used to locate the toolComponent associated with the descriptor.
    */
  var toolComponent: js.UndefOr[ToolComponentReference] = js.native
}
object ReportingDescriptorReference {
  
  @scala.inline
  def apply(): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
  
  @scala.inline
  implicit class ReportingDescriptorReferenceMutableBuilder[Self <: ReportingDescriptorReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setToolComponent(value: ToolComponentReference): Self = StObject.set(x, "toolComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolComponentUndefined: Self = StObject.set(x, "toolComponent", js.undefined)
  }
}
