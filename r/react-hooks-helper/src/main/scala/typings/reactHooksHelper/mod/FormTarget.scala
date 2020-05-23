package typings.reactHooksHelper.mod

import typings.reactHooksHelper.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormTarget extends js.Object {
  var target: Checked
}

object FormTarget {
  @scala.inline
  def apply(target: Checked): FormTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormTarget]
  }
}

