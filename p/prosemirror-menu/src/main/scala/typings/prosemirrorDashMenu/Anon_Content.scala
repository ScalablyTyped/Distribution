package typings.prosemirrorDashMenu

import typings.prosemirrorDashMenu.prosemirrorDashMenuMod.MenuElement
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content[S /* <: Schema[_, _] */] extends js.Object {
  var content: js.Array[js.Array[MenuElement[S]]]
  var floating: js.UndefOr[Boolean | Null] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](content: js.Array[js.Array[MenuElement[S]]], floating: js.UndefOr[Boolean] = js.undefined): Anon_Content[S] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content[S]]
  }
}

