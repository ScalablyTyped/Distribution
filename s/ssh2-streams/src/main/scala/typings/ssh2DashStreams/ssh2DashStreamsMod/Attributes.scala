package typings.ssh2DashStreams.ssh2DashStreamsMod

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
    val __obj = js.Dynamic.literal(atime = atime, gid = gid, mode = mode, mtime = mtime, size = size, uid = uid)
  
    __obj.asInstanceOf[Attributes]
  }
}

