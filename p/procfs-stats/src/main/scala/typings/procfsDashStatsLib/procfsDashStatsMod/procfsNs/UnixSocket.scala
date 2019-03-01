package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixSocket extends js.Object {
  var Flags: java.lang.String
  var Inode: java.lang.String
  var Num: java.lang.String
  var Path: java.lang.String
  var Protocol: java.lang.String
  var RefCount: java.lang.String
  var St: java.lang.String
  var Type: java.lang.String
}

object UnixSocket {
  @scala.inline
  def apply(
    Flags: java.lang.String,
    Inode: java.lang.String,
    Num: java.lang.String,
    Path: java.lang.String,
    Protocol: java.lang.String,
    RefCount: java.lang.String,
    St: java.lang.String,
    Type: java.lang.String
  ): UnixSocket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("Inode")(Inode)
    __obj.updateDynamic("Num")(Num)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("Protocol")(Protocol)
    __obj.updateDynamic("RefCount")(RefCount)
    __obj.updateDynamic("St")(St)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[UnixSocket]
  }
}

