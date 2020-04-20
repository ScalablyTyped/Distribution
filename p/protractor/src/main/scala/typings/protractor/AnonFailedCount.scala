package typings.protractor

import typings.protractor.pluginsMod.SpecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailedCount extends js.Object {
  var failedCount: Double
  var specResults: js.Array[SpecResult]
}

object AnonFailedCount {
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): AnonFailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailedCount]
  }
}

