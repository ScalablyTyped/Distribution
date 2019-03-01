package typings
package prosemirrorDashMenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var content: js.Array[js.Array[prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuElement[S]]]
  var floating: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    content: js.Array[js.Array[prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuElement[S]]],
    floating: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Content[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    __obj.asInstanceOf[Anon_Content[S]]
  }
}

