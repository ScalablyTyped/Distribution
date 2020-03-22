package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.AnonDefaultVideo
import typings.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typings.stremioAddonSdk.stremioAddonSdkStrings.regular
import typings.stremioAddonSdk.stremioAddonSdkStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed description of a meta item.
  *
  * This description is displayed when the user selects an item form the catalog.
  */
trait MetaDetail extends MetaPreview {
  /**
    * Human-readable that describes all the significant awards.
    */
  var awards: js.UndefOr[String] = js.undefined
  var behaviourHints: js.UndefOr[AnonDefaultVideo] = js.undefined
  /**
    * Array of members of the cast.
    *
    * use 'links' instead
    *
    * @deprecated
    */
  var cast: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Official country of origin.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Array of directors.
    *
    * Deprecated: use 'links' instead
    *
    * @deprecated
    */
  var director: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * genre/categories of the content.
    *
    * e.g. ["Thriller", "Horror"]
    *
    * **WARNING: this will soon be deprecated, use 'links' instead**
    */
  var genres: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * IMDb rating, which should be a number from 0.0 to 10.0.
    */
  var imdbRating: js.UndefOr[String] = js.undefined
  /**
    * Spoken language.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Can be used to link to internal pages of Stremio.
    *
    * example: array of actor / genre / director links.
    */
  var links: js.UndefOr[js.Array[MetaLink]] = js.undefined
  var releaseInfo: js.UndefOr[String] = js.undefined
  /**
    * ISO 8601, initial release date.
    *
    * For movies, this is the cinema debut.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: js.UndefOr[String] = js.undefined
  /**
    * Human-readable expected runtime.
    *
    * e.g. "120m"
    */
  var runtime: js.UndefOr[String] = js.undefined
  /**
    * Used for channel and series.
    *
    * If you do not provide this (e.g. for movie), Stremio assumes this meta item has one video, and it's ID is equal to the meta item id.
    */
  var videos: js.UndefOr[js.Array[MetaVideo]] = js.undefined
  /**
    * URL to official website.
    */
  var website: js.UndefOr[String] = js.undefined
}

object MetaDetail {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: ContentType,
    awards: String = null,
    background: String = null,
    behaviourHints: AnonDefaultVideo = null,
    cast: js.Array[String] = null,
    country: String = null,
    description: String = null,
    director: js.Array[String] = null,
    genres: js.Array[String] = null,
    imdbRating: String = null,
    language: String = null,
    links: js.Array[MetaLink] = null,
    logo: String = null,
    poster: String = null,
    posterShape: square | regular | landscape = null,
    releaseInfo: String = null,
    released: String = null,
    runtime: String = null,
    videos: js.Array[MetaVideo] = null,
    website: String = null
  ): MetaDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (awards != null) __obj.updateDynamic("awards")(awards.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (behaviourHints != null) __obj.updateDynamic("behaviourHints")(behaviourHints.asInstanceOf[js.Any])
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (director != null) __obj.updateDynamic("director")(director.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    if (imdbRating != null) __obj.updateDynamic("imdbRating")(imdbRating.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (posterShape != null) __obj.updateDynamic("posterShape")(posterShape.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (released != null) __obj.updateDynamic("released")(released.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (videos != null) __obj.updateDynamic("videos")(videos.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDetail]
  }
}

