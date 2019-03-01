package typings
package reactDashShowDashMoreLib.reactDashShowDashMoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactShowMoreProps extends js.Object {
  var anchorClass: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[java.lang.String] = js.undefined
  var less: js.UndefOr[java.lang.String] = js.undefined
  var lines: js.UndefOr[scala.Double] = js.undefined
  var more: js.UndefOr[java.lang.String] = js.undefined
}

object ReactShowMoreProps {
  @scala.inline
  def apply(
    anchorClass: java.lang.String = null,
    children: java.lang.String = null,
    less: java.lang.String = null,
    lines: scala.Int | scala.Double = null,
    more: java.lang.String = null
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

