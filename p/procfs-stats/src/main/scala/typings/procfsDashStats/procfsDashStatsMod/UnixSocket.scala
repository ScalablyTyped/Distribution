package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixSocket extends js.Object {
  var Flags: String
  var Inode: String
  var Num: String
  var Path: String
  var Protocol: String
  var RefCount: String
  var St: String
  var Type: String
}

object UnixSocket {
  @scala.inline
  def apply(
    Flags: String,
    Inode: String,
    Num: String,
    Path: String,
    Protocol: String,
    RefCount: String,
    St: String,
    Type: String
  ): UnixSocket = {
    val __obj = js.Dynamic.literal(Flags = Flags, Inode = Inode, Num = Num, Path = Path, Protocol = Protocol, RefCount = RefCount, St = St, Type = Type)
  
    __obj.asInstanceOf[UnixSocket]
  }
}

