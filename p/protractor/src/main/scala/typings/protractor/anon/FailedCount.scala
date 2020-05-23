package typings.protractor.anon

import typings.protractor.pluginsMod.SpecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedCount extends js.Object {
  var failedCount: Double
  var specResults: js.Array[SpecResult]
}

object FailedCount {
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCount]
  }
}

