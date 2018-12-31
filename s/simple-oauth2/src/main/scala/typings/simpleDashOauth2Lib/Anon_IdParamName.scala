package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdParamName[ClientIdName /* <: java.lang.String */] extends js.Object {
  /** Service registered client id. Required. */
  var id: java.lang.String
  /** Parameter name used to send the client id. Default to client_id. */
  var idParamName: js.UndefOr[ClientIdName] = js.undefined
  /** Service registered client secret. Required. */
  var secret: java.lang.String
  /** Parameter name used to send the client secret. Default to client_secret. */
  var secretParamName: js.UndefOr[java.lang.String] = js.undefined
}

