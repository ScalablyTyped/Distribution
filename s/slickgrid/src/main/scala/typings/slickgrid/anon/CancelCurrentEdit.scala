package typings.slickgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean
  def commitCurrentEdit(): Boolean
}

object CancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): CancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
    __obj.asInstanceOf[CancelCurrentEdit]
  }
}

