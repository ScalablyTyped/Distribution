package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.resourceShortManifestReso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The addonInterface, as returned from builder.getInterface()
  */
trait AddonInterface extends StObject {
  
  def get(args: resourceShortManifestReso): js.Promise[js.Any]
  
  var manifest: Manifest
}
object AddonInterface {
  
  inline def apply(get: resourceShortManifestReso => js.Promise[js.Any], manifest: Manifest): AddonInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonInterface]
  }
  
  extension [Self <: AddonInterface](x: Self) {
    
    inline def setGet(value: resourceShortManifestReso => js.Promise[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setManifest(value: Manifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
  }
}
