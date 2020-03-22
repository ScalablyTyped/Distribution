package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.ContentType
import typings.stremioAddonSdk.mod.ShortManifestResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  resource  :stremio-addon-sdk.stremio-addon-sdk.ShortManifestResource} & stremio-addon-sdk.stremio-addon-sdk.Args */
trait resourceShortManifestReso extends js.Object {
  var extra: AnonGenre
  var id: String
  var resource: ShortManifestResource
  var `type`: ContentType
}

object resourceShortManifestReso {
  @scala.inline
  def apply(extra: AnonGenre, id: String, resource: ShortManifestResource, `type`: ContentType): resourceShortManifestReso = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[resourceShortManifestReso]
  }
}

