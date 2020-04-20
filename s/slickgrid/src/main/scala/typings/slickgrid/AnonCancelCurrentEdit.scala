package typings.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean
  def commitCurrentEdit(): Boolean
}

object AnonCancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): AnonCancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
    __obj.asInstanceOf[AnonCancelCurrentEdit]
  }
}

