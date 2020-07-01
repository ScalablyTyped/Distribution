package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientDefsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object GradientDefsProps {
  @scala.inline
  def apply(className: String = null): GradientDefsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientDefsProps]
  }
}

