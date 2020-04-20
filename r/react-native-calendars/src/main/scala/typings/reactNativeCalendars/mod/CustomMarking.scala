package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarking extends Marking {
  var customStyles: MarkedDateCustomStyles
}

object CustomMarking {
  @scala.inline
  def apply(customStyles: MarkedDateCustomStyles): CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarking]
  }
}

