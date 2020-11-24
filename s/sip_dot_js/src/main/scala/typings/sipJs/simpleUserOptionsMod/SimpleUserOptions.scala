package typings.sipJs.simpleUserOptionsMod

import typings.sipJs.simpleUserDelegateMod.SimpleUserDelegate
import typings.sipJs.userAgentOptionsMod.UserAgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleUserOptions extends js.Object {
  
  /**
    * User's SIP Address of Record (AOR).
    * @remarks
    * The AOR is registered to receive incoming calls.
    * If not specified, a random anonymous address is created for the user.
    */
  var aor: js.UndefOr[String] = js.native
  
  /**
    * Delegate for SimpleUser.
    */
  var delegate: js.UndefOr[SimpleUserDelegate] = js.native
  
  /**
    * Media options.
    */
  var media: js.UndefOr[SimpleUserMedia] = js.native
  
  /**
    * Maximum number of times to attempt to reconnection.
    * @remarks
    * When the transport connection is lost (WebSocket disconnects),
    * reconnection will be attempted immediately. If that fails,
    * reconnection will be attempted again when the browser indicates
    * the application has come online. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/NavigatorOnLine
    * @defaultValue 3
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  
  /**
    * Seconds to wait between reconnection attempts.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.native
  
  /**
    * Options for UserAgent.
    */
  var userAgentOptions: js.UndefOr[UserAgentOptions] = js.native
}
object SimpleUserOptions {
  
  @scala.inline
  def apply(): SimpleUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserOptions]
  }
  
  @scala.inline
  implicit class SimpleUserOptionsOps[Self <: SimpleUserOptions] (val x: Self) extends AnyVal {
    
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
    def setAor(value: String): Self = this.set("aor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAor: Self = this.set("aor", js.undefined)
    
    @scala.inline
    def setDelegate(value: SimpleUserDelegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setMedia(value: SimpleUserMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = this.set("reconnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectionAttempts: Self = this.set("reconnectionAttempts", js.undefined)
    
    @scala.inline
    def setReconnectionDelay(value: Double): Self = this.set("reconnectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectionDelay: Self = this.set("reconnectionDelay", js.undefined)
    
    @scala.inline
    def setUserAgentOptions(value: UserAgentOptions): Self = this.set("userAgentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgentOptions: Self = this.set("userAgentOptions", js.undefined)
  }
}
