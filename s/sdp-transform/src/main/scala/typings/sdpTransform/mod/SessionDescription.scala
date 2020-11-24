package typings.sdpTransform.mod

import typings.sdpTransform.anon.Address
import typings.sdpTransform.anon.Start
import typings.sdpTransform.anon.typestringportnumberproto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionDescription
  extends SessionAttributes
     with SharedDescriptionFields {
  
  // e=
  var email: js.UndefOr[String] = js.native
  
  // m=
  var media: js.Array[typestringportnumberproto] = js.native
  
  // s=
  var name: js.UndefOr[String] = js.native
  
  // o=
  var origin: js.UndefOr[Address] = js.native
  
  // p=
  var phone: js.UndefOr[String] = js.native
  
  // r=
  var repeats: js.UndefOr[String] = js.native
  
  // z=
  var timezones: js.UndefOr[String] = js.native
  
  // t=0 0
  var timing: js.UndefOr[Start] = js.native
  
  // u=
  var uri: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object SessionDescription {
  
  @scala.inline
  def apply(media: js.Array[typestringportnumberproto]): SessionDescription = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescription]
  }
  
  @scala.inline
  implicit class SessionDescriptionOps[Self <: SessionDescription] (val x: Self) extends AnyVal {
    
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
    def setMediaVarargs(value: typestringportnumberproto*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[typestringportnumberproto]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigin(value: Address): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setRepeats(value: String): Self = this.set("repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeats: Self = this.set("repeats", js.undefined)
    
    @scala.inline
    def setTimezones(value: String): Self = this.set("timezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezones: Self = this.set("timezones", js.undefined)
    
    @scala.inline
    def setTiming(value: Start): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
