package typings.reactFromDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var nodeOnly: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    index: Int | Double = null,
    level: Int | Double = null,
    nodeOnly: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    `type`: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeOnly)) __obj.updateDynamic("nodeOnly")(nodeOnly.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

