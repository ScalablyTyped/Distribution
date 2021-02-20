package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSECommand extends StObject {
  
  var channels: String = js.native
  
  var displayName: String = js.native
  
  var profileUrl: String = js.native
  
  var userId: String = js.native
}
object SSECommand {
  
  @scala.inline
  def apply(channels: String, displayName: String, profileUrl: String, userId: String): SSECommand = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSECommand]
  }
  
  @scala.inline
  implicit class SSECommandMutableBuilder[Self <: SSECommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
