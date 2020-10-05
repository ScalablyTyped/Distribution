package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpSdesTransportEventMap extends js.Object {
  var error: Event = js.native
}

object RTCSrtpSdesTransportEventMap {
  @scala.inline
  def apply(error: Event): RTCSrtpSdesTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesTransportEventMap]
  }
  @scala.inline
  implicit class RTCSrtpSdesTransportEventMapOps[Self <: RTCSrtpSdesTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

