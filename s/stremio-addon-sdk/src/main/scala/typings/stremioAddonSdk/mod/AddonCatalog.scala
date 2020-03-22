package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used as a response for defineResourceHandler.
  */
trait AddonCatalog extends js.Object {
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
  @scala.inline
  def apply(manifest: Manifest, transportName: String, transportUrl: String): AddonCatalog = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], transportName = transportName.asInstanceOf[js.Any], transportUrl = transportUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddonCatalog]
  }
}

