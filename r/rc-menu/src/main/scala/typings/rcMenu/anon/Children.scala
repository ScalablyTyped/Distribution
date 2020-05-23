package typings.rcMenu.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[typings.react.mod.Key] = js.undefined
}

object Children {
  @scala.inline
  def apply(
    children: ReactNode = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    eventKey: typings.react.mod.Key = null
  ): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.get.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

