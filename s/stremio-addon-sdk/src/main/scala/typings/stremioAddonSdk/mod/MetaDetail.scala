package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.DefaultVideo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaDetail
  extends StObject
     with MetaPreview {
  
  /**
    * Human-readable that describes all the significant awards.
    */
  var awards: js.UndefOr[String] = js.undefined
  
  var behaviourHints: js.UndefOr[DefaultVideo] = js.undefined
  
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
  
  inline def apply(id: String, name: String, `type`: ContentType): MetaDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDetail]
  }
  
  extension [Self <: MetaDetail](x: Self) {
    
    inline def setAwards(value: String): Self = StObject.set(x, "awards", value.asInstanceOf[js.Any])
    
    inline def setAwardsUndefined: Self = StObject.set(x, "awards", js.undefined)
    
    inline def setBehaviourHints(value: DefaultVideo): Self = StObject.set(x, "behaviourHints", value.asInstanceOf[js.Any])
    
    inline def setBehaviourHintsUndefined: Self = StObject.set(x, "behaviourHints", js.undefined)
    
    inline def setCast(value: js.Array[String]): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    inline def setCastVarargs(value: String*): Self = StObject.set(x, "cast", js.Array(value*))
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDirector(value: js.Array[String]): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
    
    inline def setDirectorUndefined: Self = StObject.set(x, "director", js.undefined)
    
    inline def setDirectorVarargs(value: String*): Self = StObject.set(x, "director", js.Array(value*))
    
    inline def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    inline def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value*))
    
    inline def setImdbRating(value: String): Self = StObject.set(x, "imdbRating", value.asInstanceOf[js.Any])
    
    inline def setImdbRatingUndefined: Self = StObject.set(x, "imdbRating", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinks(value: js.Array[MetaLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: MetaLink*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setReleaseInfo(value: String): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
    
    inline def setReleaseInfoUndefined: Self = StObject.set(x, "releaseInfo", js.undefined)
    
    inline def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
    
    inline def setReleasedUndefined: Self = StObject.set(x, "released", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setVideos(value: js.Array[MetaVideo]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    inline def setVideosUndefined: Self = StObject.set(x, "videos", js.undefined)
    
    inline def setVideosVarargs(value: MetaVideo*): Self = StObject.set(x, "videos", js.Array(value*))
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
