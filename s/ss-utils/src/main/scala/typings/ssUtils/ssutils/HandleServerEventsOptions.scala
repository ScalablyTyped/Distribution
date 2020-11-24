package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleServerEventsOptions extends js.Object {
  
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
  implicit class HandleServerEventsOptionsOps[Self <: HandleServerEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: StringDictionary[js.Function]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setHeartbeatIntervalMs(value: Double): Self = this.set("heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatIntervalMs: Self = this.set("heartbeatIntervalMs", js.undefined)
    
    @scala.inline
    def setHeartbeatUrl(value: String): Self = this.set("heartbeatUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatUrl: Self = this.set("heartbeatUrl", js.undefined)
    
    @scala.inline
    def setReceivers(value: StringDictionary[js.Any]): Self = this.set("receivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivers: Self = this.set("receivers", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setUnRegisterUrl(value: String): Self = this.set("unRegisterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnRegisterUrl: Self = this.set("unRegisterUrl", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean
    ): Self = this.set("validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
