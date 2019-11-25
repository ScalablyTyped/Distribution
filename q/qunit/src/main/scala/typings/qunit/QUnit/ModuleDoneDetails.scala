package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleDoneDetails extends js.Object {
  var failed: Double
  var name: String
  var passed: Double
  var runtime: Double
  var total: Double
}

object ModuleDoneDetails {
  @scala.inline
  def apply(failed: Double, name: String, passed: Double, runtime: Double, total: Double): ModuleDoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModuleDoneDetails]
  }
}

