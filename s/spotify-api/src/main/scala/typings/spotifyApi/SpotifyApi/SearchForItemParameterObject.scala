package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Parameter Objects for searching
//
/**
  * Object for search parameters for searching for tracks, playlists, artists or albums.
  * See: [Search for an item](https://developer.spotify.com/web-api/search-item/)
  *
  * `q` and `type` are required in the API. Previous versions of the type declarations marked them
  * as optional in order for external libraries to "implement them as function call parameters instead".
  * Now, the type declaration shall mark them as required. If necessary, one can consider this to be a
  * "breaking change". In that case, one can use TypeScript's built-in utility type `Omit<T, K>`.
  * For example, one can remove the `q` and `type` by annotating the type
  * as `Omit<SpotifyApi.SearchForItemParameterObject, "q" | "type">`.
  */
trait SearchForItemParameterObject extends StObject {
  
  /**
    * Possible values: `audio`.
    * If `include_external=audio` is specified, the response will include any relevant audio content that is hosted externally.
    * By default external content is filtered out from responses.
    */
  var include_external: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return.
    * Default: `20`. Minimum: `1`. Maximum: `50`.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or the string `from_token`.
    * If a country code is specified, only artists, albums, and tracks with content that is playable in that market is returned.
    */
  var market: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the first result to return.
    * Default: `0` (first result). Maximum offset (including limit): `2,000`.
    * Use with limit to get the next page of search results.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The search query's keywords (and optional field filters and operators).
    */
  var q: String
  
  /**
    * A comma-separated list of item types to search across. Valid types are: `album`, `artist`, `playlist`, and `track`.
    * Search results include hits from all the specified item types.
    * For example: `q=name:abacab&type=album,track` returns both albums and tracks with `“abacab”` included in their name.
    */
  var `type`: String
}
object SearchForItemParameterObject {
  
  inline def apply(q: String, `type`: String): SearchForItemParameterObject = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForItemParameterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchForItemParameterObject] (val x: Self) extends AnyVal {
    
    inline def setInclude_external(value: String): Self = StObject.set(x, "include_external", value.asInstanceOf[js.Any])
    
    inline def setInclude_externalUndefined: Self = StObject.set(x, "include_external", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
