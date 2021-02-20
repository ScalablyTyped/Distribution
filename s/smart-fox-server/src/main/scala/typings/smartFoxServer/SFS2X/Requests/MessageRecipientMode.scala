package typings.smartFoxServer.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageRecipientMode extends StObject {
  
  /** @type {number} Returns the selected recipient mode. */
  var mode: Double = js.native
  
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: js.Any = js.native
}
object MessageRecipientMode {
  
  @scala.inline
  def apply(mode: Double, target: js.Any): MessageRecipientMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMode]
  }
  
  @scala.inline
  implicit class MessageRecipientModeMutableBuilder[Self <: MessageRecipientMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
