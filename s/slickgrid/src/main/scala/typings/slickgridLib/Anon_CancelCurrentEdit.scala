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
  def apply(cancelCurrentEdit: js.Function0[scala.Boolean], commitCurrentEdit: js.Function0[scala.Boolean]): Anon_CancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = cancelCurrentEdit, commitCurrentEdit = commitCurrentEdit)
  
    __obj.asInstanceOf[Anon_CancelCurrentEdit]
  }
}

