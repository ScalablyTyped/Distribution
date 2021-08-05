package typings.reactRelay

import typings.relayRuntime.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRelayEnvironmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useRelayEnvironment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRelayEnvironment(): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("useRelayEnvironment")().asInstanceOf[Environment]
}
