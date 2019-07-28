package typings.psDashTree.psDashTreeMod

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
    val __obj = js.Dynamic.literal(COMMAND = COMMAND, PID = PID, PPID = PPID, STAT = STAT)
  
    __obj.asInstanceOf[PS]
  }
}

