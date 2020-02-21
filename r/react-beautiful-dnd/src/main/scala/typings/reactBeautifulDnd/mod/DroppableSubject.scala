package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableSubject extends js.Object {
  // The hitbox for a droppable
  // - page margin box
  // - with scroll changes
  // - with any additional droppable placeholder
  // - clipped by frame
  // The subject will be null if the hit area is completely empty
  var active: js.UndefOr[Rect] = js.undefined
  // raw, unchanging
  var page: BoxModel
  var withPlaceholder: js.UndefOr[PlaceholderInSubject] = js.undefined
}

object DroppableSubject {
  @scala.inline
  def apply(page: BoxModel, active: Rect = null, withPlaceholder: PlaceholderInSubject = null): DroppableSubject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (withPlaceholder != null) __obj.updateDynamic("withPlaceholder")(withPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableSubject]
  }
}

