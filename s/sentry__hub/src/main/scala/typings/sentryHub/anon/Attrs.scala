package typings.sentryHub.anon

import typings.sentryTypes.sessionMod.SessionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs extends js.Object {
  
  var attrs: js.UndefOr[Environment] = js.native
  
  var did: js.UndefOr[String] = js.native
  
  var duration: Double = js.native
  
  var errors: Double = js.native
  
  var init: Boolean = js.native
  
  var sid: String = js.native
  
  var started: String = js.native
  
  var status: SessionStatus = js.native
  
  var timestamp: String = js.native
}
object Attrs {
  
  @scala.inline
  def apply(
    duration: Double,
    errors: Double,
    init: Boolean,
    sid: String,
    started: String,
    status: SessionStatus,
    timestamp: String
  ): Attrs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: String): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SessionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrs(value: Environment): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setDid(value: String): Self = this.set("did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDid: Self = this.set("did", js.undefined)
  }
}
