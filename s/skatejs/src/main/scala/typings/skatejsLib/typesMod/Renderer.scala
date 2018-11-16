package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer[O] extends js.Object {
  def renderer(
    root: stdLib.Element,
    html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]
  ): scala.Unit = js.native
  def renderer(
    root: stdLib.Node,
    html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]
  ): scala.Unit = js.native
  def renderer(
    root: stdLib.ShadowRoot,
    html: js.Function2[/* props */ js.UndefOr[Mixed], /* state */ js.UndefOr[Mixed], O]
  ): scala.Unit = js.native
}

