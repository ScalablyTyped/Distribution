package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSBuddy
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_LIST_INIT extends js.Object {
  var buddyList: js.Array[SFSBuddy]
  var myVariables: js.Array[SFSBuddyVariable]
}

object IBUDDY_LIST_INIT {
  @scala.inline
  def apply(buddyList: js.Array[SFSBuddy], myVariables: js.Array[SFSBuddyVariable]): IBUDDY_LIST_INIT = {
    val __obj = js.Dynamic.literal(buddyList = buddyList, myVariables = myVariables)
  
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
}

