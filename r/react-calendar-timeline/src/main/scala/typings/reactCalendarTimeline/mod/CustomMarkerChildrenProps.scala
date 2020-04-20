package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarkerChildrenProps extends js.Object {
  var date: Double
  var styles: CSSProperties
}

object CustomMarkerChildrenProps {
  @scala.inline
  def apply(date: Double, styles: CSSProperties): CustomMarkerChildrenProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkerChildrenProps]
  }
}

