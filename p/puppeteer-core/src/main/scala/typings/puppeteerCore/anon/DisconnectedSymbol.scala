package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectedSymbol extends StObject {
  
  val Disconnected: js.Symbol
}
object DisconnectedSymbol {
  
  @scala.inline
  def apply(Disconnected: js.Symbol): DisconnectedSymbol = {
    val __obj = js.Dynamic.literal(Disconnected = Disconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectedSymbol]
  }
  
  @scala.inline
  implicit class DisconnectedSymbolMutableBuilder[Self <: DisconnectedSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnected(value: js.Symbol): Self = StObject.set(x, "Disconnected", value.asInstanceOf[js.Any])
  }
}
