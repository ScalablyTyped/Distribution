package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getRouter(addonInterface: typings.stremioAddonSdk.mod.AddonInterface): js.Any = typings.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRouter")(addonInterface.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def publishToCentral(url: java.lang.String): scala.Unit = typings.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("publishToCentral")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def serveHTTP(
  addonInterface: typings.stremioAddonSdk.mod.AddonInterface,
  options: typings.stremioAddonSdk.anon.CacheMaxAge
): scala.Unit = (typings.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serveHTTP")(addonInterface.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
