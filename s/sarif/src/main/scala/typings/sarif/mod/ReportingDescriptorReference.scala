package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingDescriptorReference extends StObject {
  
  /**
    * A guid that uniquely identifies the descriptor.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the descriptor.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors,
    * or toolComponent.taxonomyDescriptors, depending on context.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A reference used to locate the toolComponent associated with the descriptor.
    */
  var toolComponent: js.UndefOr[ToolComponentReference] = js.undefined
}
object ReportingDescriptorReference {
  
  inline def apply(): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingDescriptorReference] (val x: Self) extends AnyVal {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setToolComponent(value: ToolComponentReference): Self = StObject.set(x, "toolComponent", value.asInstanceOf[js.Any])
    
    inline def setToolComponentUndefined: Self = StObject.set(x, "toolComponent", js.undefined)
  }
}
