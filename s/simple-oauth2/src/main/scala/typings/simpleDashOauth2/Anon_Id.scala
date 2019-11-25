package typings.simpleDashOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id[ClientIdName /* <: String */] extends js.Object {
  /** Service registered client id. Required. */
  var id: String
  /** Parameter name used to send the client id. Default to client_id. */
  var idParamName: js.UndefOr[ClientIdName] = js.undefined
  /** Service registered client secret. Required. */
  var secret: String
  /** Parameter name used to send the client secret. Default to client_secret. */
  var secretParamName: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply[ClientIdName /* <: String */](id: String, secret: String, idParamName: ClientIdName = null, secretParamName: String = null): Anon_Id[ClientIdName] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (idParamName != null) __obj.updateDynamic("idParamName")(idParamName.asInstanceOf[js.Any])
    if (secretParamName != null) __obj.updateDynamic("secretParamName")(secretParamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id[ClientIdName]]
  }
}

