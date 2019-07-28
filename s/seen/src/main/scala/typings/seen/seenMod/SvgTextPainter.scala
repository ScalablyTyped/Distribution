package typings.seen.seenMod

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgTextPainter")
@js.native
class SvgTextPainter protected () extends js.Object {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  def fillText(m: js.Array[Double], text: String): Unit = js.native
  def fillText(m: js.Array[Double], text: String, style: Partial[CSSStyleDeclaration]): Unit = js.native
}

