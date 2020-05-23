package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  streams  :std.Array<stremio-addon-sdk.stremio-addon-sdk.Stream>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait streamsArrayStreamCache extends js.Object {
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.undefined
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.undefined
  var streams: js.Array[Stream]
}

object streamsArrayStreamCache {
  @scala.inline
  def apply(
    streams: js.Array[Stream],
    cacheMaxAge: js.UndefOr[Double] = js.undefined,
    staleError: js.UndefOr[Double] = js.undefined,
    staleRevalidate: js.UndefOr[Double] = js.undefined
  ): streamsArrayStreamCache = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheMaxAge)) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleError)) __obj.updateDynamic("staleError")(staleError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleRevalidate)) __obj.updateDynamic("staleRevalidate")(staleRevalidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamsArrayStreamCache]
  }
}

