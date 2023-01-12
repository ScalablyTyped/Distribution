package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactLocation extends StObject {
  
  /**
    * A short description of the artifact location.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[String] = js.undefined
}
object ArtifactLocation {
  
  inline def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriBaseId(value: String): Self = StObject.set(x, "uriBaseId", value.asInstanceOf[js.Any])
    
    inline def setUriBaseIdUndefined: Self = StObject.set(x, "uriBaseId", js.undefined)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
