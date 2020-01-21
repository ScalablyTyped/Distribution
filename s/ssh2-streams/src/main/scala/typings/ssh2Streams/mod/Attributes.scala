package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var atime: Double
  var gid: Double
  var mode: Double
  var mtime: Double
  var size: Double
  var uid: Double
}

object Attributes {
  @scala.inline
  def apply(atime: Double, gid: Double, mode: Double, mtime: Double, size: Double, uid: Double): Attributes = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attributes]
  }
}

