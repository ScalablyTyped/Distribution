package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRelayModernEnvironmentMod {
  
  @JSImport("relay-runtime/lib/store/isRelayModernEnvironment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRelayModernEnvironment(environment: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelayModernEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
