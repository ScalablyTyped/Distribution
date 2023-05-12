package typings.sentryInternalTracing

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsLibOnHiddenMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/lib/onHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onHidden(cb: OnHiddenCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onHidden")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onHidden(cb: OnHiddenCallback, once: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onHidden")(cb.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type OnHiddenCallback = js.Function1[/* event */ Event, Unit]
}
