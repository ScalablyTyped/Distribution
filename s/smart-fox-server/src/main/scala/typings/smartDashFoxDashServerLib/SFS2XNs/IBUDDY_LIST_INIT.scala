package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_LIST_INIT extends js.Object {
  var buddyList: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy]
  var myVariables: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable]
}

object IBUDDY_LIST_INIT {
  @scala.inline
  def apply(
    buddyList: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy],
    myVariables: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable]
  ): IBUDDY_LIST_INIT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buddyList")(buddyList)
    __obj.updateDynamic("myVariables")(myVariables)
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
}

