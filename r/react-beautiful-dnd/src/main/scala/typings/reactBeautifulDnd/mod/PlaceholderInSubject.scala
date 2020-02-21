package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderInSubject extends js.Object {
  // might not actually be increased by
  // placeholder if there is no required space
  var increasedBy: js.UndefOr[Position] = js.undefined
  // max scroll before placeholder added
  // will be null if there was no frame
  var oldFrameMaxScroll: js.UndefOr[Position] = js.undefined
  var placeholderSize: Position
}

object PlaceholderInSubject {
  @scala.inline
  def apply(placeholderSize: Position, increasedBy: Position = null, oldFrameMaxScroll: Position = null): PlaceholderInSubject = {
    val __obj = js.Dynamic.literal(placeholderSize = placeholderSize.asInstanceOf[js.Any])
    if (increasedBy != null) __obj.updateDynamic("increasedBy")(increasedBy.asInstanceOf[js.Any])
    if (oldFrameMaxScroll != null) __obj.updateDynamic("oldFrameMaxScroll")(oldFrameMaxScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderInSubject]
  }
}

