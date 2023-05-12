package typings.sentryReplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilIsSampledMod {
  
  @JSImport("@sentry/replay/types/util/isSampled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSampled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSampled")().asInstanceOf[Boolean]
  inline def isSampled(sampleRate: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSampled")(sampleRate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
