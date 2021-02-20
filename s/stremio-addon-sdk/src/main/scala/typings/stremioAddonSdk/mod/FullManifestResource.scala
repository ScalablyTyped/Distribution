package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullManifestResource extends StObject {
  
  /**
    * Use this if you want your addon to be called only for specific content IDs
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resource name.
    */
  var name: ShortManifestResource = js.native
  
  /**
    * Supported types.
    */
  var types: js.Array[ContentType] = js.native
}
object FullManifestResource {
  
  @scala.inline
  def apply(name: ShortManifestResource, types: js.Array[ContentType]): FullManifestResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullManifestResource]
  }
  
  @scala.inline
  implicit class FullManifestResourceMutableBuilder[Self <: FullManifestResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdPrefixes(value: js.Array[String]): Self = StObject.set(x, "idPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixesUndefined: Self = StObject.set(x, "idPrefixes", js.undefined)
    
    @scala.inline
    def setIdPrefixesVarargs(value: String*): Self = StObject.set(x, "idPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ShortManifestResource): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[ContentType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: ContentType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
