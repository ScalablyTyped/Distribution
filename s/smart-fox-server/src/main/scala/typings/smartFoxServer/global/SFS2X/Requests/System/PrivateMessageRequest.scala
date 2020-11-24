package typings.smartFoxServer.global.SFS2X.Requests.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.PrivateMessageRequest")
@js.native
class PrivateMessageRequest protected ()
  extends typings.smartFoxServer.SFS2X.Requests.System.PrivateMessageRequest {
  /**
    * Creates a new PrivateMessageRequest instance.
    * @param {string} message     The message to be sent to to the recipient user.
    * @param {number} recipientId The id of the user to which the message is to be sent.
    * @param {Object} [params=null]      An object containing additional custom parameters to be sent to the message recipient (for example the color of the text, etc).
    */
  def this(message: String, recipientId: Double) = this()
  def this(message: String, recipientId: Double, params: js.Object) = this()
}
