package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.Subtitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  subtitles  :std.Array<stremio-addon-sdk.stremio-addon-sdk.Subtitle>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait subtitlesArraySubtitleCac extends js.Object {
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
  var subtitles: js.Array[Subtitle]
}

object subtitlesArraySubtitleCac {
  @scala.inline
  def apply(
    subtitles: js.Array[Subtitle],
    cacheMaxAge: js.UndefOr[Double] = js.undefined,
    staleError: js.UndefOr[Double] = js.undefined,
    staleRevalidate: js.UndefOr[Double] = js.undefined
  ): subtitlesArraySubtitleCac = {
    val __obj = js.Dynamic.literal(subtitles = subtitles.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheMaxAge)) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleError)) __obj.updateDynamic("staleError")(staleError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleRevalidate)) __obj.updateDynamic("staleRevalidate")(staleRevalidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitlesArraySubtitleCac]
  }
}

