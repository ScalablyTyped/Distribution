package typings.relayRuntime.anon

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.start',   transactionID :number,   params :relay-runtime.relay-runtime/lib/util/RelayConcreteNode.RequestParameters,   variables :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.Variables}> */
trait Readonlynameexecutestartt
  extends StObject
     with LogEvent {
  
  val name: executeDotstart
  
  val params: RequestParameters
  
  val transactionID: Double
  
  val variables: Variables
}
object Readonlynameexecutestartt {
  
  @scala.inline
  def apply(params: RequestParameters, transactionID: Double, variables: Variables): Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = "execute.start", params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutestartt]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutestarttMutableBuilder[Self <: Readonlynameexecutestartt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: executeDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
