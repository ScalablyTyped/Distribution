package typings
package simplecrawlerLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends simplecrawlerLib.netMod.Server {
  var maxHeadersCount: scala.Double = js.native
  var timeout: scala.Double = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function): scala.Unit = js.native
}

