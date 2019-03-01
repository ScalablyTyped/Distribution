package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepStyles extends js.Object {
  /**
    * See https://github.com/gilbarbara/react-joyride/blob/master/docs/styling.md
    */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object StepStyles {
  @scala.inline
  def apply(options: org.scalablytyped.runtime.StringDictionary[js.Any] = null): StepStyles = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[StepStyles]
  }
}

