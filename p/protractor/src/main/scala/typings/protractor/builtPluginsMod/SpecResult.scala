package typings.protractor.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecResult extends js.Object {
  var assertions: js.Array[AssertionResult]
  var description: String
}

object SpecResult {
  @scala.inline
  def apply(assertions: js.Array[AssertionResult], description: String): SpecResult = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecResult]
  }
}

