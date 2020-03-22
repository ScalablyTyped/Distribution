package typings.seen.mod

import typings.seen.PartialCSSStyleDeclaratio
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgTextPainter")
@js.native
class SvgTextPainter protected () extends js.Object {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  def fillText(m: js.Array[Double], text: String): Unit = js.native
  def fillText(m: js.Array[Double], text: String, style: PartialCSSStyleDeclaratio): Unit = js.native
}

