package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stacktraceMod {
  
  @JSImport("@sentry/utils/dist/stacktrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFunctionName(fn: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
}
