package typings
package simplecrawlerLib.ttyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "ReadStream")
@js.native
class ReadStream ()
  extends simplecrawlerLib.netMod.Socket {
  var isRaw: scala.Boolean = js.native
  var isTTY: scala.Boolean = js.native
  def setRawMode(mode: scala.Boolean): scala.Unit = js.native
}

