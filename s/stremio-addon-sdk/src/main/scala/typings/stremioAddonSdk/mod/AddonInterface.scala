package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.resourceShortManifestReso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The addonInterface, as returned from builder.getInterface()
  */
@js.native
trait AddonInterface extends StObject {
  
  def get(args: resourceShortManifestReso): js.Promise[_] = js.native
  
  var manifest: Manifest = js.native
}
object AddonInterface {
  
  @scala.inline
  def apply(get: resourceShortManifestReso => js.Promise[_], manifest: Manifest): AddonInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonInterface]
  }
  
  @scala.inline
  implicit class AddonInterfaceMutableBuilder[Self <: AddonInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: resourceShortManifestReso => js.Promise[_]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setManifest(value: Manifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
  }
}
