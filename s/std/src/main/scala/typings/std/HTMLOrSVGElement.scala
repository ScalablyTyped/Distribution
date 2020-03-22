package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOrSVGElement extends js.Object {
  var autofocus: scala.Boolean = js.native
  val dataset: DOMStringMap = js.native
  var nonce: js.UndefOr[java.lang.String] = js.native
  var tabIndex: Double = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def focus(options: FocusOptions): Unit = js.native
}

