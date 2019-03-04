package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILOGIN extends js.Object {
  var data: js.Object
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object ILOGIN {
  @scala.inline
  def apply(data: js.Object, user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser): ILOGIN = {
    val __obj = js.Dynamic.literal(data = data, user = user)
  
    __obj.asInstanceOf[ILOGIN]
  }
}

