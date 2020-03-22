package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.AddonCatalog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  addons  :std.Array<stremio-addon-sdk.stremio-addon-sdk.AddonCatalog>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait addonsArrayAddonCatalogCa extends js.Object {
  var addons: js.Array[AddonCatalog]
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
}

object addonsArrayAddonCatalogCa {
  @scala.inline
  def apply(
    addons: js.Array[AddonCatalog],
    cacheMaxAge: Int | Double = null,
    staleError: Int | Double = null,
    staleRevalidate: Int | Double = null
  ): addonsArrayAddonCatalogCa = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any])
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (staleError != null) __obj.updateDynamic("staleError")(staleError.asInstanceOf[js.Any])
    if (staleRevalidate != null) __obj.updateDynamic("staleRevalidate")(staleRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[addonsArrayAddonCatalogCa]
  }
}

