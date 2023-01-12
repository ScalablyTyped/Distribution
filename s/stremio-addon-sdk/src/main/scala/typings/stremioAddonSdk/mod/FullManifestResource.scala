package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullManifestResource extends StObject {
  
  /**
    * Use this if you want your addon to be called only for specific content IDs
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Resource name.
    */
  var name: ShortManifestResource
  
  /**
    * Supported types.
    */
  var types: js.Array[ContentType]
}
object FullManifestResource {
  
  inline def apply(name: ShortManifestResource, types: js.Array[ContentType]): FullManifestResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullManifestResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullManifestResource] (val x: Self) extends AnyVal {
    
    inline def setIdPrefixes(value: js.Array[String]): Self = StObject.set(x, "idPrefixes", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixesUndefined: Self = StObject.set(x, "idPrefixes", js.undefined)
    
    inline def setIdPrefixesVarargs(value: String*): Self = StObject.set(x, "idPrefixes", js.Array(value*))
    
    inline def setName(value: ShortManifestResource): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[ContentType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: ContentType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
