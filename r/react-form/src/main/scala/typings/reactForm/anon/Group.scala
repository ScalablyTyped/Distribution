package typings.reactForm.anon

import typings.reactForm.mod.FieldApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var group: FieldApi
}

object Group {
  @scala.inline
  def apply(group: FieldApi): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

