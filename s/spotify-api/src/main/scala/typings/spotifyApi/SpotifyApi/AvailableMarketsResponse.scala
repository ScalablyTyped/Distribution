package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Available Markets
  *
  * GET /v1/markets
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/get-available-markets
  */
trait AvailableMarketsResponse extends StObject {
  
  var markets: js.Array[String]
}
object AvailableMarketsResponse {
  
  inline def apply(markets: js.Array[String]): AvailableMarketsResponse = {
    val __obj = js.Dynamic.literal(markets = markets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableMarketsResponse]
  }
  
  extension [Self <: AvailableMarketsResponse](x: Self) {
    
    inline def setMarkets(value: js.Array[String]): Self = StObject.set(x, "markets", value.asInstanceOf[js.Any])
    
    inline def setMarketsVarargs(value: String*): Self = StObject.set(x, "markets", js.Array(value*))
  }
}
