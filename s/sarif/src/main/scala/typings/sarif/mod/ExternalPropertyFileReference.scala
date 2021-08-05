package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalPropertyFileReference extends StObject {
  
  /**
    * A stable, unique identifer for the external property file in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * A non-negative integer specifying the number of items contained in the external property file.
    */
  var itemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the external property file.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the external property file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object ExternalPropertyFileReference {
  
  inline def apply(): ExternalPropertyFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalPropertyFileReference]
  }
  
  extension [Self <: ExternalPropertyFileReference](x: Self) {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
