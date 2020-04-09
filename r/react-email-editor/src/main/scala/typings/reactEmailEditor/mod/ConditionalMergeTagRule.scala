package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalMergeTagRule extends js.Object {
  val after: String
  val before: String
  val name: String
}

object ConditionalMergeTagRule {
  @scala.inline
  def apply(after: String, before: String, name: String): ConditionalMergeTagRule = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConditionalMergeTagRule]
  }
}

