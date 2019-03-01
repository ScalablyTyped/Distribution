package typings
package protractorLib.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecResult extends js.Object {
  var assertions: js.Array[AssertionResult]
  var description: java.lang.String
}

object SpecResult {
  @scala.inline
  def apply(assertions: js.Array[AssertionResult], description: java.lang.String): SpecResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assertions")(assertions)
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SpecResult]
  }
}

