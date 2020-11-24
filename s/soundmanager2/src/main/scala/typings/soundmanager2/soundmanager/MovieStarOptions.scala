package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovieStarOptions extends js.Object {
  
  var bufferTime: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double | Null] = js.native
  
  var onconnect: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var serverURL: js.UndefOr[String | Null] = js.native
}
object MovieStarOptions {
  
  @scala.inline
  def apply(): MovieStarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovieStarOptions]
  }
  
  @scala.inline
  implicit class MovieStarOptionsOps[Self <: MovieStarOptions] (val x: Self) extends AnyVal {
    
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
    def setBufferTime(value: Double): Self = this.set("bufferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferTime: Self = this.set("bufferTime", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    
    @scala.inline
    def setOnconnect(value: () => Unit): Self = this.set("onconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnconnect: Self = this.set("onconnect", js.undefined)
    
    @scala.inline
    def setOnconnectNull: Self = this.set("onconnect", null)
    
    @scala.inline
    def setServerURL(value: String): Self = this.set("serverURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerURL: Self = this.set("serverURL", js.undefined)
    
    @scala.inline
    def setServerURLNull: Self = this.set("serverURL", null)
  }
}
