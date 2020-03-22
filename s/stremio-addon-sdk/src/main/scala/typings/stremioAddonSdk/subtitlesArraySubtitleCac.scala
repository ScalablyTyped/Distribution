package typings.stremioAddonSdk

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
    cacheMaxAge: Int | Double = null,
    staleError: Int | Double = null,
    staleRevalidate: Int | Double = null
  ): subtitlesArraySubtitleCac = {
    val __obj = js.Dynamic.literal(subtitles = subtitles.asInstanceOf[js.Any])
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (staleError != null) __obj.updateDynamic("staleError")(staleError.asInstanceOf[js.Any])
    if (staleRevalidate != null) __obj.updateDynamic("staleRevalidate")(staleRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitlesArraySubtitleCac]
  }
}

