package typings
package psDashTreeLib.psDashTreeMod.psUnderscoreTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PS extends js.Object {
  var COMMAND: java.lang.String
  var PID: java.lang.String
  var PPID: java.lang.String
  var STAT: java.lang.String
}

object PS {
  @scala.inline
  def apply(COMMAND: java.lang.String, PID: java.lang.String, PPID: java.lang.String, STAT: java.lang.String): PS = {
    val __obj = js.Dynamic.literal(COMMAND = COMMAND, PID = PID, PPID = PPID, STAT = STAT)
  
    __obj.asInstanceOf[PS]
  }
}

