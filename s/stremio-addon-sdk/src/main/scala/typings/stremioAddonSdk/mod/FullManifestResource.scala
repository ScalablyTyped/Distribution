package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullManifestResource extends js.Object {
  /**
    * Use this if you want your addon to be called only for specific content IDs
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Resource name.
    */
  var name: ShortManifestResource
  /**
    * Supported types.
    */
  var types: js.Array[ContentType]
}

object FullManifestResource {
  @scala.inline
  def apply(name: ShortManifestResource, types: js.Array[ContentType], idPrefixes: js.Array[String] = null): FullManifestResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (idPrefixes != null) __obj.updateDynamic("idPrefixes")(idPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullManifestResource]
  }
}

