package typings.reactBigCalendar.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceHeaderProps extends js.Object {
  var index: Double
  var label: ReactNode
  var resource: js.Object
}

object ResourceHeaderProps {
  @scala.inline
  def apply(index: Double, resource: js.Object, label: ReactNode = null): ResourceHeaderProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceHeaderProps]
  }
}

