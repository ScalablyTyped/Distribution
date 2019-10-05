package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestDoneDetails extends js.Object {
  var failed: Double
  var module: String
  var name: String
  var passed: Double
  var runtime: Double
  var total: Double
}

object TestDoneDetails {
  @scala.inline
  def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): TestDoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed, module = module, name = name, passed = passed, runtime = runtime, total = total)
  
    __obj.asInstanceOf[TestDoneDetails]
  }
}

