package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRequestIdentifierMod {
  
  @JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(parameters: RequestParameters, variables: Variables): RequestIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parameters.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RequestIdentifier]
  
  type RequestIdentifier = String
}
