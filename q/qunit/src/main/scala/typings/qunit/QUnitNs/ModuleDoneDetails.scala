package typings.qunit.QUnitNs

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
    val __obj = js.Dynamic.literal(failed = failed, name = name, passed = passed, runtime = runtime, total = total)
  
    __obj.asInstanceOf[ModuleDoneDetails]
  }
}

