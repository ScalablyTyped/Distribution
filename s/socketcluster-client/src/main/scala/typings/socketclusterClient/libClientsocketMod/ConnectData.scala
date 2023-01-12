package typings.socketclusterClient.libClientsocketMod

import typings.socketclusterClient.libTransportMod.OnOpenValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectData
  extends StObject
     with OnOpenValue {
  
  def processPendingSubscriptions(): Unit
}
object ConnectData {
  
  inline def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double, processPendingSubscriptions: () => Unit): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], processPendingSubscriptions = js.Any.fromFunction0(processPendingSubscriptions), authToken = null)
    __obj.asInstanceOf[ConnectData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectData] (val x: Self) extends AnyVal {
    
    inline def setProcessPendingSubscriptions(value: () => Unit): Self = StObject.set(x, "processPendingSubscriptions", js.Any.fromFunction0(value))
  }
}
