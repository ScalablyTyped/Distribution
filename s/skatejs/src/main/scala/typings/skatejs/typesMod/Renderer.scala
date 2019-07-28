package typings.skatejs.typesMod

import typings.std.Element
import typings.std.Node
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer[O] extends js.Object {
  def renderer(root: Element, html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: Node, html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(
    root: ShadowRoot,
    html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]
  ): Unit = js.native
}

