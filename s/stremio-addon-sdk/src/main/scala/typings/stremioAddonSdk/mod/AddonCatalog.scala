package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonCatalog extends StObject {
  
  /**
    * Object representing the addon's Manifest Object.
    */
  var manifest: Manifest
  
  /**
    * only http is currently officially supported.
    */
  var transportName: String
  
  /**
    * The URL of the addon's manifest.json file.
    */
  var transportUrl: String
}
object AddonCatalog {
  
  inline def apply(manifest: Manifest, transportName: String, transportUrl: String): AddonCatalog = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], transportName = transportName.asInstanceOf[js.Any], transportUrl = transportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonCatalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddonCatalog] (val x: Self) extends AnyVal {
    
    inline def setManifest(value: Manifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setTransportName(value: String): Self = StObject.set(x, "transportName", value.asInstanceOf[js.Any])
    
    inline def setTransportUrl(value: String): Self = StObject.set(x, "transportUrl", value.asInstanceOf[js.Any])
  }
}
