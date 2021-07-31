package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@sentry/utils/dist/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forget(promise: js.Thenable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forget")(promise.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
