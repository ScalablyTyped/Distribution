package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecialLocations extends StObject {
  
  /**
    * Provides a suggestion to SARIF consumers to display file paths relative to the specified location.
    */
  var displayBase: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the special locations.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object SpecialLocations {
  
  inline def apply(): SpecialLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecialLocations]
  }
  
  extension [Self <: SpecialLocations](x: Self) {
    
    inline def setDisplayBase(value: ArtifactLocation): Self = StObject.set(x, "displayBase", value.asInstanceOf[js.Any])
    
    inline def setDisplayBaseUndefined: Self = StObject.set(x, "displayBase", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
