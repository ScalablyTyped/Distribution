package typings.reactCompass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCompassProps extends js.Object {
  var direction: Double
  var directionNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ReactCompassProps {
  @scala.inline
  def apply(direction: Double, directionNames: js.Array[String] = null): ReactCompassProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (directionNames != null) __obj.updateDynamic("directionNames")(directionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCompassProps]
  }
}

