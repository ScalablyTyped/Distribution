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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Attributes]
  }
}

