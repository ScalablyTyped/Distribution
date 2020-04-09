package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMergeTag extends MergeTag {
  val name: String
  val value: String
}

object SimpleMergeTag {
  @scala.inline
  def apply(name: String, value: String): SimpleMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SimpleMergeTag]
  }
}

