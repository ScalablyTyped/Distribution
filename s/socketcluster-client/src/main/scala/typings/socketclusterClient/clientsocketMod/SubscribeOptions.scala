package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeOptions extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}
object SubscribeOptions {
  
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setWaitForAuth(value: Boolean): Self = StObject.set(x, "waitForAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForAuthUndefined: Self = StObject.set(x, "waitForAuth", js.undefined)
  }
}
