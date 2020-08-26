package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.ContentType
import typings.stremioAddonSdk.mod.ShortManifestResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  resource :stremio-addon-sdk.stremio-addon-sdk.ShortManifestResource} & stremio-addon-sdk.stremio-addon-sdk.Args */
@js.native
trait resourceShortManifestReso extends js.Object {
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
  implicit class resourceShortManifestResoOps[Self <: resourceShortManifestReso] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtra(value: Genre): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: ShortManifestResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

