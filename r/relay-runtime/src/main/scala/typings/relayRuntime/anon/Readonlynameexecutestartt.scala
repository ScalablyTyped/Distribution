package typings.relayRuntime.anon

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.start',   transactionID :number,   params :relay-runtime.relay-runtime/lib/util/RelayConcreteNode.RequestParameters,   variables :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.Variables}> */
@js.native
trait Readonlynameexecutestartt extends LogEvent {
  
  val name: executeDotstart = js.native
  
  val params: RequestParameters = js.native
  
  val transactionID: Double = js.native
  
  val variables: Variables = js.native
}
object Readonlynameexecutestartt {
  
  @scala.inline
  def apply(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutestartt]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutestarttOps[Self <: Readonlynameexecutestartt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: executeDotstart): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: RequestParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
