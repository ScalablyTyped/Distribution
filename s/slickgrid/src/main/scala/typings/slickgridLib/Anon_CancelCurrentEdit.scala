package typings
package slickgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): scala.Boolean
  def commitCurrentEdit(): scala.Boolean
}

object Anon_CancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => scala.Boolean, commitCurrentEdit: () => scala.Boolean): Anon_CancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
  
    __obj.asInstanceOf[Anon_CancelCurrentEdit]
  }
}

