package typings.sentryUtils

import typings.sentryUtils.typesMod.RequireResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interopRequireDefaultMod {
  
  @JSImport("@sentry/utils/types/buildPolyfills/_interopRequireDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interopRequireDefault(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopRequireDefault")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
}
