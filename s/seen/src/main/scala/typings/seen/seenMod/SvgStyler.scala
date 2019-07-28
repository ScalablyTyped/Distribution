package typings.seen.seenMod

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgStyler")
@js.native
class SvgStyler protected () extends js.Object {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  def clear(): this.type = js.native
  def draw(): this.type = js.native
  def draw(style: Partial[CSSStyleDeclaration]): this.type = js.native
  def fill(): this.type = js.native
  def fill(style: Partial[CSSStyleDeclaration]): this.type = js.native
}

