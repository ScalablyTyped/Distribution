package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeTag extends js.Object {
  val name: String
  val value: String
}

object MergeTag {
  @scala.inline
  def apply(name: String, value: String): MergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeTag]
  }
}

