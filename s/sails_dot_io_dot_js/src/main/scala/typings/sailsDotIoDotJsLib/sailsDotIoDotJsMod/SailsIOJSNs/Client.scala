package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod.SailsIOJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var sails: ClientSails
  var socket: Socket
}

object Client {
  @scala.inline
  def apply(sails: ClientSails, socket: Socket): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sails")(sails)
    __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[Client]
  }
}

