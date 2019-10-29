package typings.reactDashFromDashDom.reactDashFromDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var actions: js.UndefOr[js.Array[IAction]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var nodeOnly: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    actions: js.Array[IAction] = null,
    index: Int | Double = null,
    level: Int | Double = null,
    nodeOnly: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    `type`: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeOnly)) __obj.updateDynamic("nodeOnly")(nodeOnly)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOptions]
  }
}

