package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.DefaultVideo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed description of a meta item.
  *
  * This description is displayed when the user selects an item form the catalog.
  */
@js.native
trait MetaDetail extends MetaPreview {
  /**
    * Human-readable that describes all the significant awards.
    */
  var awards: js.UndefOr[String] = js.native
  var behaviourHints: js.UndefOr[DefaultVideo] = js.native
  /**
    * Array of members of the cast.
    *
    * use 'links' instead
    *
    * @deprecated
    */
  var cast: js.UndefOr[js.Array[String]] = js.native
  /**
    * Official country of origin.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Array of directors.
    *
    * Deprecated: use 'links' instead
    *
    * @deprecated
    */
  var director: js.UndefOr[js.Array[String]] = js.native
  /**
    * genre/categories of the content.
    *
    * e.g. ["Thriller", "Horror"]
    *
    * **WARNING: this will soon be deprecated, use 'links' instead**
    */
  var genres: js.UndefOr[js.Array[String]] = js.native
  /**
    * IMDb rating, which should be a number from 0.0 to 10.0.
    */
  var imdbRating: js.UndefOr[String] = js.native
  /**
    * Spoken language.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Can be used to link to internal pages of Stremio.
    *
    * example: array of actor / genre / director links.
    */
  var links: js.UndefOr[js.Array[MetaLink]] = js.native
  var releaseInfo: js.UndefOr[String] = js.native
  /**
    * ISO 8601, initial release date.
    *
    * For movies, this is the cinema debut.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: js.UndefOr[String] = js.native
  /**
    * Human-readable expected runtime.
    *
    * e.g. "120m"
    */
  var runtime: js.UndefOr[String] = js.native
  /**
    * Used for channel and series.
    *
    * If you do not provide this (e.g. for movie), Stremio assumes this meta item has one video, and it's ID is equal to the meta item id.
    */
  var videos: js.UndefOr[js.Array[MetaVideo]] = js.native
  /**
    * URL to official website.
    */
  var website: js.UndefOr[String] = js.native
}

object MetaDetail {
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): MetaDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDetail]
  }
  @scala.inline
  implicit class MetaDetailOps[Self <: MetaDetail] (val x: Self) extends AnyVal {
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
    def setAwards(value: String): Self = this.set("awards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwards: Self = this.set("awards", js.undefined)
    @scala.inline
    def setBehaviourHints(value: DefaultVideo): Self = this.set("behaviourHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviourHints: Self = this.set("behaviourHints", js.undefined)
    @scala.inline
    def setCastVarargs(value: String*): Self = this.set("cast", js.Array(value :_*))
    @scala.inline
    def setCast(value: js.Array[String]): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDirectorVarargs(value: String*): Self = this.set("director", js.Array(value :_*))
    @scala.inline
    def setDirector(value: js.Array[String]): Self = this.set("director", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirector: Self = this.set("director", js.undefined)
    @scala.inline
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    @scala.inline
    def setGenres(value: js.Array[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
    @scala.inline
    def setImdbRating(value: String): Self = this.set("imdbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImdbRating: Self = this.set("imdbRating", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLinksVarargs(value: MetaLink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[MetaLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setReleaseInfo(value: String): Self = this.set("releaseInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseInfo: Self = this.set("releaseInfo", js.undefined)
    @scala.inline
    def setReleased(value: String): Self = this.set("released", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleased: Self = this.set("released", js.undefined)
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setVideosVarargs(value: MetaVideo*): Self = this.set("videos", js.Array(value :_*))
    @scala.inline
    def setVideos(value: js.Array[MetaVideo]): Self = this.set("videos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideos: Self = this.set("videos", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

