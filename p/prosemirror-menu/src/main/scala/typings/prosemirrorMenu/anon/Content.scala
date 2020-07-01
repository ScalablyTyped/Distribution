package typings.prosemirrorMenu.anon

import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content[S /* <: Schema[_, _] */] extends js.Object {
  var content: js.Array[js.Array[MenuElement[S]]]
  var floating: js.UndefOr[Boolean | Null] = js.undefined
}

object Content {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](content: js.Array[js.Array[MenuElement[S]]], floating: js.UndefOr[Null | Boolean] = js.undefined): Content[S] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[S]]
  }
}

