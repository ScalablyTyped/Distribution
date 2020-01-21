package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
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
    val __obj = js.Dynamic.literal(buddyList = buddyList.asInstanceOf[js.Any], myVariables = myVariables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
}

