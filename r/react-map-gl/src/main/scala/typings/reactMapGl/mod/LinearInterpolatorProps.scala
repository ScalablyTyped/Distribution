package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearInterpolatorProps extends js.Object {
  var around: js.UndefOr[js.Array[Double]] = js.undefined
  var transitionProps: js.UndefOr[js.Array[String]] = js.undefined
}

object LinearInterpolatorProps {
  @scala.inline
  def apply(around: js.Array[Double] = null, transitionProps: js.Array[String] = null): LinearInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (transitionProps != null) __obj.updateDynamic("transitionProps")(transitionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearInterpolatorProps]
  }
}

