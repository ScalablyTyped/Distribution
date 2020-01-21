package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptorInfo extends js.Object {
  var flags: String
  var pos: String
}

object FileDescriptorInfo {
  @scala.inline
  def apply(flags: String, pos: String): FileDescriptorInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileDescriptorInfo]
  }
}

