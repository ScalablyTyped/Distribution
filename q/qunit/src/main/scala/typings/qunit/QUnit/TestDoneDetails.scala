package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestDoneDetails extends js.Object {
  var failed: Double = js.native
  var module: String = js.native
  var name: String = js.native
  var passed: Double = js.native
  var runtime: Double = js.native
  var total: Double = js.native
}

object TestDoneDetails {
  @scala.inline
  def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): TestDoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDoneDetails]
  }
  @scala.inline
  implicit class TestDoneDetailsOps[Self <: TestDoneDetails] (val x: Self) extends AnyVal {
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Double): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Double): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

