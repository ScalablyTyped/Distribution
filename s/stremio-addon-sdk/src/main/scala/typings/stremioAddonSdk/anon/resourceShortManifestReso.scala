package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.ContentType
import typings.stremioAddonSdk.mod.ShortManifestResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  resource :stremio-addon-sdk.stremio-addon-sdk.ShortManifestResource} & stremio-addon-sdk.stremio-addon-sdk.Args */
@js.native
trait resourceShortManifestReso extends StObject {
  
  var extra: Genre = js.native
  
  var id: String = js.native
  
  var resource: ShortManifestResource = js.native
  
  var `type`: ContentType = js.native
}
object resourceShortManifestReso {
  
  @scala.inline
  def apply(extra: Genre, id: String, resource: ShortManifestResource, `type`: ContentType): resourceShortManifestReso = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[resourceShortManifestReso]
  }
  
  @scala.inline
  implicit class resourceShortManifestResoMutableBuilder[Self <: resourceShortManifestReso] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: Genre): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ShortManifestResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
