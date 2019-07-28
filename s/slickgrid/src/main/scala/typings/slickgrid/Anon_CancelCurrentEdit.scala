package typings.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean
  def commitCurrentEdit(): Boolean
}

object Anon_CancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): Anon_CancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
  
    __obj.asInstanceOf[Anon_CancelCurrentEdit]
  }
}

