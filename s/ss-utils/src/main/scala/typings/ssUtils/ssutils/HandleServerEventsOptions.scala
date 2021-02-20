package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleServerEventsOptions extends StObject {
  
  var handlers: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var heartbeatIntervalMs: js.UndefOr[Double] = js.native
  
  var heartbeatUrl: js.UndefOr[String] = js.native
  
  var receivers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var success: js.UndefOr[js.Function3[/* selector */ String, /* msg */ String, /* e */ js.Any, Unit]] = js.native
  
  var unRegisterUrl: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[String], 
      /* target */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* json */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
}
object HandleServerEventsOptions {
  
  @scala.inline
  def apply(): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
  
  @scala.inline
  implicit class HandleServerEventsOptionsMutableBuilder[Self <: HandleServerEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlers(value: StringDictionary[js.Function]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatIntervalMsUndefined: Self = StObject.set(x, "heartbeatIntervalMs", js.undefined)
    
    @scala.inline
    def setHeartbeatUrl(value: String): Self = StObject.set(x, "heartbeatUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatUrlUndefined: Self = StObject.set(x, "heartbeatUrl", js.undefined)
    
    @scala.inline
    def setReceivers(value: StringDictionary[js.Any]): Self = StObject.set(x, "receivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiversUndefined: Self = StObject.set(x, "receivers", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUnRegisterUrl(value: String): Self = StObject.set(x, "unRegisterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnRegisterUrlUndefined: Self = StObject.set(x, "unRegisterUrl", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
