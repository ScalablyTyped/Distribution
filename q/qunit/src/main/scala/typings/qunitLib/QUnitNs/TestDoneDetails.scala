package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestDoneDetails extends js.Object {
  var failed: scala.Double
  var module: java.lang.String
  var name: java.lang.String
  var passed: scala.Double
  var runtime: scala.Double
  var total: scala.Double
}

object TestDoneDetails {
  @scala.inline
  def apply(
    failed: scala.Double,
    module: java.lang.String,
    name: java.lang.String,
    passed: scala.Double,
    runtime: scala.Double,
    total: scala.Double
  ): TestDoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed, module = module, name = name, passed = passed, runtime = runtime, total = total)
  
    __obj.asInstanceOf[TestDoneDetails]
  }
}

