package typings
package sixDashRuntimeLib.SixNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait log extends js.Object {
  def debug(msg: java.lang.String, restOfVar: js.Any*): scala.Unit = js.native
  def error(msg: java.lang.String, restOfVar: js.Any*): scala.Unit = js.native
  def error(msg: stdLib.Error, restOfVar: js.Any*): scala.Unit = js.native
  def info(msg: java.lang.String, restOfVar: js.Any*): scala.Unit = js.native
  def warn(msg: java.lang.String, restOfVar: js.Any*): scala.Unit = js.native
}

