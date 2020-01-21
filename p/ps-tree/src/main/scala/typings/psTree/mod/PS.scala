package typings.psTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PS extends js.Object {
  var COMMAND: String
  var PID: String
  var PPID: String
  var STAT: String
}

object PS {
  @scala.inline
  def apply(COMMAND: String, PID: String, PPID: String, STAT: String): PS = {
    val __obj = js.Dynamic.literal(COMMAND = COMMAND.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PPID = PPID.asInstanceOf[js.Any], STAT = STAT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PS]
  }
}

