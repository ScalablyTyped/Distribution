package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used as a response for defineResourceHandler.
  */
@js.native
trait AddonCatalog extends StObject {
  
  /**
    * Object representing the addon's Manifest Object.
    */
  var manifest: Manifest = js.native
  
  /**
    * only http is currently officially supported.
    */
  var transportName: String = js.native
  
  /**
    * The URL of the addon's manifest.json file.
    */
  var transportUrl: String = js.native
}
object AddonCatalog {
  
  @scala.inline
  def apply(manifest: Manifest, transportName: String, transportUrl: String): AddonCatalog = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], transportName = transportName.asInstanceOf[js.Any], transportUrl = transportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonCatalog]
  }
  
  @scala.inline
  implicit class AddonCatalogMutableBuilder[Self <: AddonCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifest(value: Manifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportName(value: String): Self = StObject.set(x, "transportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUrl(value: String): Self = StObject.set(x, "transportUrl", value.asInstanceOf[js.Any])
  }
}
