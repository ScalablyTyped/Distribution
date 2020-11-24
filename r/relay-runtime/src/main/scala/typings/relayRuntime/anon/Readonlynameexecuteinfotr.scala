package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotinfo
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.info',   transactionID :number,   info :any}> */
@js.native
trait Readonlynameexecuteinfotr extends LogEvent {
  
  val info: js.Any = js.native
  
  val name: executeDotinfo = js.native
  
  val transactionID: Double = js.native
}
object Readonlynameexecuteinfotr {
  
  @scala.inline
  def apply(info: js.Any, name: executeDotinfo, transactionID: Double): Readonlynameexecuteinfotr = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteinfotr]
  }
  
  @scala.inline
  implicit class ReadonlynameexecuteinfotrOps[Self <: Readonlynameexecuteinfotr] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: executeDotinfo): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
