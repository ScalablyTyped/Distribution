package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_MESSAGE extends js.Object {
  var buddy: SFSBuddy
  var data: js.Object
  var isItMe: Boolean
  var message: String
}

object IBUDDY_MESSAGE {
  @scala.inline
  def apply(buddy: SFSBuddy, data: js.Object, isItMe: Boolean, message: String): IBUDDY_MESSAGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBUDDY_MESSAGE]
  }
}

