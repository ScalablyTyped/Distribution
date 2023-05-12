package typings.reactLeafletCore

import typings.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttributionMod {
  
  @JSImport("@react-leaflet/core/lib/attribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAttribution(map: Map_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAttribution")(map.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAttribution(map: Map_, attribution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAttribution")(map.asInstanceOf[js.Any], attribution.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
