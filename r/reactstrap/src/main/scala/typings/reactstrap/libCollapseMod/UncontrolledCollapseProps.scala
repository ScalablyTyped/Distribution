package typings.reactstrap.libCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledCollapseProps extends CollapseProps {
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var toggleEvents: js.UndefOr[js.Array[String]] = js.undefined
  var toggler: String
}

object UncontrolledCollapseProps {
  @scala.inline
  def apply(
    toggler: String,
    CollapseProps: CollapseProps = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    toggleEvents: js.Array[String] = null
  ): UncontrolledCollapseProps = {
    val __obj = js.Dynamic.literal(toggler = toggler)
    js.Dynamic.global.Object.assign(__obj, CollapseProps)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (toggleEvents != null) __obj.updateDynamic("toggleEvents")(toggleEvents)
    __obj.asInstanceOf[UncontrolledCollapseProps]
  }
}

