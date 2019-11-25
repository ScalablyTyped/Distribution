package typings.protractor

import typings.protractor.builtPluginsMod.SpecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedCount extends js.Object {
  var failedCount: Double
  var specResults: js.Array[SpecResult]
}

object Anon_FailedCount {
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): Anon_FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FailedCount]
  }
}

