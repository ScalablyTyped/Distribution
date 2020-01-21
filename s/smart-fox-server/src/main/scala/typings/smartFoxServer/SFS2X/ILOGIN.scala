package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILOGIN extends js.Object {
  var data: js.Object
  var user: SFSUser
}

object ILOGIN {
  @scala.inline
  def apply(data: js.Object, user: SFSUser): ILOGIN = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILOGIN]
  }
}

