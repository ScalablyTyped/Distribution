package typings
package procfsDashStatsLib.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptorInfo extends js.Object {
  var flags: java.lang.String
  var pos: java.lang.String
}

object FileDescriptorInfo {
  @scala.inline
  def apply(flags: java.lang.String, pos: java.lang.String): FileDescriptorInfo = {
    val __obj = js.Dynamic.literal(flags = flags, pos = pos)
  
    __obj.asInstanceOf[FileDescriptorInfo]
  }
}

