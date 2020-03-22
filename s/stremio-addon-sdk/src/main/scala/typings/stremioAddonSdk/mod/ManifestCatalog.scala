package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestCatalog extends js.Object {
  /**
    * All extra properties related to this catalog.
    */
  var extra: js.UndefOr[js.Array[ManifestExtra]] = js.undefined
  /**
    * Use the 'options' property of 'extra' instead.
    * @deprecated
    */
  var genres: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The id of the catalog, can be any unique string describing the catalog (unique per addon, as an addon can have many catalogs).
    *
    * For example: if the catalog name is "Favourite Youtube Videos", the id can be "fav_youtube_videos".
    */
  var id: String
  /**
    * Human readable name of the catalog.
    */
  var name: String
  /**
    *  This is the content type of the catalog.
    */
  var `type`: ContentType
}

object ManifestCatalog {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: ContentType,
    extra: js.Array[ManifestExtra] = null,
    genres: js.Array[String] = null
  ): ManifestCatalog = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestCatalog]
  }
}

