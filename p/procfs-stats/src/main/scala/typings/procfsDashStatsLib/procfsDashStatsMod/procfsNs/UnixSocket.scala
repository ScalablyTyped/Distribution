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
    val __obj = js.Dynamic.literal(Flags = Flags, Inode = Inode, Num = Num, Path = Path, Protocol = Protocol, RefCount = RefCount, St = St, Type = Type)
  
    __obj.asInstanceOf[UnixSocket]
  }
}

