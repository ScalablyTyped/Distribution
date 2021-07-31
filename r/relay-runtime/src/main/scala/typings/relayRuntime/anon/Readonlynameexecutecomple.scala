package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotcomplete
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.complete',   transactionID :number}> */
trait Readonlynameexecutecomple
  extends StObject
     with LogEvent {
  
  val name: executeDotcomplete
  
  val transactionID: Double
}
object Readonlynameexecutecomple {
  
  @scala.inline
  def apply(transactionID: Double): Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(name = "execute.complete", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutecomple]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutecompleMutableBuilder[Self <: Readonlynameexecutecomple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: executeDotcomplete): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
