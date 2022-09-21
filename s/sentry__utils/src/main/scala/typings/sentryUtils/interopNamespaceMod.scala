package typings.sentryUtils

import typings.sentryUtils.typesMod.RequireResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interopNamespaceMod {
  
  @JSImport("@sentry/utils/types/buildPolyfills/_interopNamespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interopNamespace(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopNamespace")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
}
