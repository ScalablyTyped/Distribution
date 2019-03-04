package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleDoneDetails extends js.Object {
  var failed: scala.Double
  var name: java.lang.String
  var passed: scala.Double
  var runtime: scala.Double
  var total: scala.Double
}

object ModuleDoneDetails {
  @scala.inline
  def apply(
    failed: scala.Double,
    name: java.lang.String,
    passed: scala.Double,
    runtime: scala.Double,
    total: scala.Double
  ): ModuleDoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed, name = name, passed = passed, runtime = runtime, total = total)
  
    __obj.asInstanceOf[ModuleDoneDetails]
  }
}

