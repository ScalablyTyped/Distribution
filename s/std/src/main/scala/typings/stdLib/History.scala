package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  val length: scala.Double = js.native
  var scrollRestoration: ScrollRestoration = js.native
  val state: js.Any = js.native
  def back(): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def go(): scala.Unit = js.native
  def go(delta: scala.Double): scala.Unit = js.native
  def pushState(data: js.Any, title: java.lang.String): scala.Unit = js.native
  def pushState(data: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def replaceState(data: js.Any, title: java.lang.String): scala.Unit = js.native
  def replaceState(data: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
}

@JSGlobal("History")
@js.native
object History
  extends org.scalablytyped.runtime.Instantiable0[History]

