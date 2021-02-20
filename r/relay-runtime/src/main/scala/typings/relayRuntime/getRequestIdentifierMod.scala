package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRequestIdentifierMod {
  
  @JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Default)
  @js.native
  def default(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  
  type RequestIdentifier = String
}
