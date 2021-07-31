package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotinfo
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.info',   transactionID :number,   info :any}> */
trait Readonlynameexecuteinfotr
  extends StObject
     with LogEvent {
  
  val info: js.Any
  
  val name: executeDotinfo
  
  val transactionID: Double
}
object Readonlynameexecuteinfotr {
  
  @scala.inline
  def apply(info: js.Any, transactionID: Double): Readonlynameexecuteinfotr = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = "execute.info", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteinfotr]
  }
  
  @scala.inline
  implicit class ReadonlynameexecuteinfotrMutableBuilder[Self <: Readonlynameexecuteinfotr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: executeDotinfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
