package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
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
    val __obj = js.Dynamic.literal(data = data, user = user)
  
    __obj.asInstanceOf[ILOGIN]
  }
}

