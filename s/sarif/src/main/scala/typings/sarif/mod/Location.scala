package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * A set of regions relevant to the location.
    */
  var annotations: js.UndefOr[js.Array[Region]] = js.undefined
  
  /**
    * Value that distinguishes this location from all other locations within a single result object.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * The logical locations associated with the result.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.undefined
  
  /**
    * A message relevant to the location.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Identifies the artifact and region.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * An array of objects that describe relationships between this location and others.
    */
  var relationships: js.UndefOr[js.Array[LocationRelationship]] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAnnotations(value: js.Array[Region]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Region*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogicalLocations(value: js.Array[LogicalLocation]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    inline def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    inline def setLogicalLocationsVarargs(value: LogicalLocation*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPhysicalLocation(value: PhysicalLocation): Self = StObject.set(x, "physicalLocation", value.asInstanceOf[js.Any])
    
    inline def setPhysicalLocationUndefined: Self = StObject.set(x, "physicalLocation", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRelationships(value: js.Array[LocationRelationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: LocationRelationship*): Self = StObject.set(x, "relationships", js.Array(value :_*))
  }
}
