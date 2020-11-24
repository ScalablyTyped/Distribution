package typings.reactNativeSafeArea.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPayload extends js.Object {
  
  var safeAreaInsets: SafeAreaInsets = js.native
}
object EventPayload {
  
  @scala.inline
  def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
    val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPayload]
  }
  
  @scala.inline
  implicit class EventPayloadOps[Self <: EventPayload] (val x: Self) extends AnyVal {
    
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
    def setSafeAreaInsets(value: SafeAreaInsets): Self = this.set("safeAreaInsets", value.asInstanceOf[js.Any])
  }
}
