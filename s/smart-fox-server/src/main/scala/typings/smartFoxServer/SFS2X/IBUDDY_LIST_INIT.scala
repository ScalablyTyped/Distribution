package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_LIST_INIT extends js.Object {
  var buddyList: js.Array[SFSBuddy] = js.native
  var myVariables: js.Array[SFSBuddyVariable] = js.native
}

object IBUDDY_LIST_INIT {
  @scala.inline
  def apply(buddyList: js.Array[SFSBuddy], myVariables: js.Array[SFSBuddyVariable]): IBUDDY_LIST_INIT = {
    val __obj = js.Dynamic.literal(buddyList = buddyList.asInstanceOf[js.Any], myVariables = myVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
  @scala.inline
  implicit class IBUDDY_LIST_INITOps[Self <: IBUDDY_LIST_INIT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuddyListVarargs(value: SFSBuddy*): Self = this.set("buddyList", js.Array(value :_*))
    @scala.inline
    def setBuddyList(value: js.Array[SFSBuddy]): Self = this.set("buddyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMyVariablesVarargs(value: SFSBuddyVariable*): Self = this.set("myVariables", js.Array(value :_*))
    @scala.inline
    def setMyVariables(value: js.Array[SFSBuddyVariable]): Self = this.set("myVariables", value.asInstanceOf[js.Any])
  }
  
}

