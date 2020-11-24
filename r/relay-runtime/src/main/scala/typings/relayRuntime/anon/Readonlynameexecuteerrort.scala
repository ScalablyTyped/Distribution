package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.error',   transactionID :number,   error :std.Error}> */
@js.native
trait Readonlynameexecuteerrort extends LogEvent {
  
  val error: Error = js.native
  
  val name: executeDoterror = js.native
  
  val transactionID: Double = js.native
}
object Readonlynameexecuteerrort {
  
  @scala.inline
  def apply(error: Error, name: executeDoterror, transactionID: Double): Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteerrort]
  }
  
  @scala.inline
  implicit class ReadonlynameexecuteerrortOps[Self <: Readonlynameexecuteerrort] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: executeDoterror): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
