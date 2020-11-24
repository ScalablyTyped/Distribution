package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableEvents extends js.Object {
  
  var onConnectionSlow: String = js.native
  
  var onDisconnect: String = js.native
  
  var onError: String = js.native
  
  var onReceived: String = js.native
  
  var onReconnect: String = js.native
  
  var onStart: String = js.native
  
  var onStarting: String = js.native
  
  var onStateChanged: String = js.native
}
object AvailableEvents {
  
  @scala.inline
  def apply(
    onConnectionSlow: String,
    onDisconnect: String,
    onError: String,
    onReceived: String,
    onReconnect: String,
    onStart: String,
    onStarting: String,
    onStateChanged: String
  ): AvailableEvents = {
    val __obj = js.Dynamic.literal(onConnectionSlow = onConnectionSlow.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onReceived = onReceived.asInstanceOf[js.Any], onReconnect = onReconnect.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], onStarting = onStarting.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableEvents]
  }
  
  @scala.inline
  implicit class AvailableEventsOps[Self <: AvailableEvents] (val x: Self) extends AnyVal {
    
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
    def setOnConnectionSlow(value: String): Self = this.set("onConnectionSlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisconnect(value: String): Self = this.set("onDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: String): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReceived(value: String): Self = this.set("onReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReconnect(value: String): Self = this.set("onReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStart(value: String): Self = this.set("onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStarting(value: String): Self = this.set("onStarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStateChanged(value: String): Self = this.set("onStateChanged", value.asInstanceOf[js.Any])
  }
}
