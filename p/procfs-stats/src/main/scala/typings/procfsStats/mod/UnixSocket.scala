package typings.procfsStats.mod

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
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Inode = Inode.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RefCount = RefCount.asInstanceOf[js.Any], St = St.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSocket]
  }
}

