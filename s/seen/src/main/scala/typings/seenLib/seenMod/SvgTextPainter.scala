package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgTextPainter")
@js.native
class SvgTextPainter protected () extends js.Object {
  def this(elementFactory: js.Function1[/* name */ java.lang.String, stdLib.HTMLElement]) = this()
  def fillText(m: js.Array[scala.Double], text: java.lang.String): scala.Unit = js.native
  def fillText(
    m: js.Array[scala.Double],
    text: java.lang.String,
    style: stdLib.Partial[stdLib.CSSStyleDeclaration]
  ): scala.Unit = js.native
}

