package typings.sailsDotIoDotJs.sailsDotIoDotJsMod

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
    val __obj = js.Dynamic.literal(sails = sails.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Client]
  }
}

