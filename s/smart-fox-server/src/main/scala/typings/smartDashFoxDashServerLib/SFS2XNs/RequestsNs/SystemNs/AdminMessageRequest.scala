package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.AdminMessageRequest")
@js.native
class AdminMessageRequest protected () extends js.Object {
  /**
                   * Creates a new AdminMessageRequest instance.
                   * @param {string}               message       The message of the administrator to be sent to the target user/s defined by the recipientMode parameter.
                   * @param {MessageRecipientMode} recipientMode An instance of MessageRecipientMode containing the target to which the message should be delivered.
                   * @param {Object}               [params=null]        An object containing custom parameters to be sent to the recipient user/s.
                   */
  def this(message: java.lang.String, recipientMode: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.MessageRecipientMode) = this()
  /**
                   * Creates a new AdminMessageRequest instance.
                   * @param {string}               message       The message of the administrator to be sent to the target user/s defined by the recipientMode parameter.
                   * @param {MessageRecipientMode} recipientMode An instance of MessageRecipientMode containing the target to which the message should be delivered.
                   * @param {Object}               [params=null]        An object containing custom parameters to be sent to the recipient user/s.
                   */
  def this(message: java.lang.String, recipientMode: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.MessageRecipientMode, params: js.Object) = this()
}

