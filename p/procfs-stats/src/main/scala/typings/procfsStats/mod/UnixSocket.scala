package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnixSocket extends js.Object {
  var Flags: String = js.native
  var Inode: String = js.native
  var Num: String = js.native
  var Path: String = js.native
  var Protocol: String = js.native
  var RefCount: String = js.native
  var St: String = js.native
  var Type: String = js.native
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
  @scala.inline
  implicit class UnixSocketOps[Self <: UnixSocket] (val x: Self) extends AnyVal {
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
    def setFlags(value: String): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setInode(value: String): Self = this.set("Inode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum(value: String): Self = this.set("Num", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefCount(value: String): Self = this.set("RefCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSt(value: String): Self = this.set("St", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

