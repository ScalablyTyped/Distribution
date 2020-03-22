package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.resourceShortManifestReso
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The addonInterface, as returned from builder.getInterface()
  */
trait AddonInterface extends js.Object {
  var manifest: Manifest
  def get(args: resourceShortManifestReso): js.Promise[_]
}

object AddonInterface {
  @scala.inline
  def apply(get: resourceShortManifestReso => js.Promise[_], manifest: Manifest): AddonInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddonInterface]
  }
}

