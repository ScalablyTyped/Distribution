package typings.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldPath extends js.Object {
  @JSName("$name")
  var $name: String
}

object FieldPath {
  @scala.inline
  def apply($name: String): FieldPath = {
    val __obj = js.Dynamic.literal($name = $name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPath]
  }
}

