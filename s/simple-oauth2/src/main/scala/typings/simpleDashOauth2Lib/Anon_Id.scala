package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id[ClientIdName /* <: java.lang.String */] extends js.Object {
  /** Service registered client id. Required. */
  var id: java.lang.String
  /** Parameter name used to send the client id. Default to client_id. */
  var idParamName: js.UndefOr[ClientIdName] = js.undefined
  /** Service registered client secret. Required. */
  var secret: java.lang.String
  /** Parameter name used to send the client secret. Default to client_secret. */
  var secretParamName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply[ClientIdName /* <: java.lang.String */](
    id: java.lang.String,
    secret: java.lang.String,
    idParamName: ClientIdName = null,
    secretParamName: java.lang.String = null
  ): Anon_Id[ClientIdName] = {
    val __obj = js.Dynamic.literal(id = id, secret = secret)
    if (idParamName != null) __obj.updateDynamic("idParamName")(idParamName.asInstanceOf[js.Any])
    if (secretParamName != null) __obj.updateDynamic("secretParamName")(secretParamName)
    __obj.asInstanceOf[Anon_Id[ClientIdName]]
  }
}

