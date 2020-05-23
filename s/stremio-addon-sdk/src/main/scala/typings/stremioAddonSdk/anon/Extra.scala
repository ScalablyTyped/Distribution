package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  var extra: VideoHash
  var id: String
  var `type`: ContentType
}

object Extra {
  @scala.inline
  def apply(extra: VideoHash, id: String, `type`: ContentType): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
}

