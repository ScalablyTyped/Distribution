package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.DefaultVideo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MetaDetailMutableBuilder[Self <: MetaDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwards(value: String): Self = StObject.set(x, "awards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwardsUndefined: Self = StObject.set(x, "awards", js.undefined)
    
    @scala.inline
    def setBehaviourHints(value: DefaultVideo): Self = StObject.set(x, "behaviourHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourHintsUndefined: Self = StObject.set(x, "behaviourHints", js.undefined)
    
    @scala.inline
    def setCast(value: js.Array[String]): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    @scala.inline
    def setCastVarargs(value: String*): Self = StObject.set(x, "cast", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDirector(value: js.Array[String]): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorUndefined: Self = StObject.set(x, "director", js.undefined)
    
    @scala.inline
    def setDirectorVarargs(value: String*): Self = StObject.set(x, "director", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value :_*))
    
    @scala.inline
    def setImdbRating(value: String): Self = StObject.set(x, "imdbRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImdbRatingUndefined: Self = StObject.set(x, "imdbRating", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[MetaLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: MetaLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setReleaseInfo(value: String): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseInfoUndefined: Self = StObject.set(x, "releaseInfo", js.undefined)
    
    @scala.inline
    def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasedUndefined: Self = StObject.set(x, "released", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    @scala.inline
    def setVideos(value: js.Array[MetaVideo]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosUndefined: Self = StObject.set(x, "videos", js.undefined)
    
    @scala.inline
    def setVideosVarargs(value: MetaVideo*): Self = StObject.set(x, "videos", js.Array(value :_*))
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
