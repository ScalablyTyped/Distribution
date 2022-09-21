package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.CacheMaxAge
import typings.stremioAddonSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getRouter(addonInterface: AddonInterface): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouter")(addonInterface.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def publishToCentral(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishToCentral")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def serveHTTP(addonInterface: AddonInterface, options: CacheMaxAge): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveHTTP")(addonInterface.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
