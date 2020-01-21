package typings.prosemirrorMenu

import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent[S /* <: Schema[_, _] */] extends js.Object {
  var content: js.Array[js.Array[MenuElement[S]]]
  var floating: js.UndefOr[Boolean | Null] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](content: js.Array[js.Array[MenuElement[S]]], floating: js.UndefOr[Boolean] = js.undefined): AnonContent[S] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent[S]]
  }
}

