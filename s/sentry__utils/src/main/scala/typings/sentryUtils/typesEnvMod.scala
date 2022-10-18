package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvMod {
  
  @JSImport("@sentry/utils/types/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBrowserBundle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserBundle")().asInstanceOf[Boolean]
}
