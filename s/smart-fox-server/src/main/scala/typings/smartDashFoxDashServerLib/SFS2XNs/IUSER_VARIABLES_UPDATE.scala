package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[java.lang.String]
  var user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IUSER_VARIABLES_UPDATE {
  @scala.inline
  def apply(
    changedVars: js.Array[java.lang.String],
    user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IUSER_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedVars")(changedVars)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IUSER_VARIABLES_UPDATE]
  }
}

