package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.react.reactMod.ReactNode
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
  def apply(index: Double, label: ReactNode, resource: js.Object): ResourceHeaderProps = {
    val __obj = js.Dynamic.literal(index = index, label = label.asInstanceOf[js.Any], resource = resource)
  
    __obj.asInstanceOf[ResourceHeaderProps]
  }
}

