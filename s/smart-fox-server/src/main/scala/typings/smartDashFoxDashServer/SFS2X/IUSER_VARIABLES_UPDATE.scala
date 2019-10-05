package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[String]
  var user: SFSUser
}

object IUSER_VARIABLES_UPDATE {
  @scala.inline
  def apply(changedVars: js.Array[String], user: SFSUser): IUSER_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars, user = user)
  
    __obj.asInstanceOf[IUSER_VARIABLES_UPDATE]
  }
}

