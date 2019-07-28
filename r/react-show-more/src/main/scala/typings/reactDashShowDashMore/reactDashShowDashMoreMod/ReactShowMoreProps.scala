package typings.reactDashShowDashMore.reactDashShowDashMoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactShowMoreProps extends js.Object {
  var anchorClass: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var less: js.UndefOr[String] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var more: js.UndefOr[String] = js.undefined
}

object ReactShowMoreProps {
  @scala.inline
  def apply(
    anchorClass: String = null,
    children: String = null,
    less: String = null,
    lines: Int | Double = null,
    more: String = null
  ): ReactShowMoreProps = {
    val __obj = js.Dynamic.literal()
    if (anchorClass != null) __obj.updateDynamic("anchorClass")(anchorClass)
    if (children != null) __obj.updateDynamic("children")(children)
    if (less != null) __obj.updateDynamic("less")(less)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (more != null) __obj.updateDynamic("more")(more)
    __obj.asInstanceOf[ReactShowMoreProps]
  }
}

