package typings.protractor.anon

import typings.protractor.pluginsMod.SpecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCount extends js.Object {
  var failedCount: Double = js.native
  var specResults: js.Array[SpecResult] = js.native
}

object FailedCount {
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCount]
  }
  @scala.inline
  implicit class FailedCountOps[Self <: FailedCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedCount(value: Double): Self = this.set("failedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecResultsVarargs(value: SpecResult*): Self = this.set("specResults", js.Array(value :_*))
    @scala.inline
    def setSpecResults(value: js.Array[SpecResult]): Self = this.set("specResults", value.asInstanceOf[js.Any])
  }
  
}

