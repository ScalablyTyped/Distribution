package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var atime: scala.Double
  var gid: scala.Double
  var mode: scala.Double
  var mtime: scala.Double
  var size: scala.Double
  var uid: scala.Double
}

object Attributes {
  @scala.inline
  def apply(
    atime: scala.Double,
    gid: scala.Double,
    mode: scala.Double,
    mtime: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): Attributes = {
    val __obj = js.Dynamic.literal(atime = atime, gid = gid, mode = mode, mtime = mtime, size = size, uid = uid)
  
    __obj.asInstanceOf[Attributes]
  }
}

