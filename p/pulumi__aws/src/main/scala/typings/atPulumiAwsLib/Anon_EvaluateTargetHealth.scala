package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvaluateTargetHealth extends js.Object {
  var evaluateTargetHealth: scala.Boolean
  var name: java.lang.String
  var zoneId: java.lang.String
}

object Anon_EvaluateTargetHealth {
  @scala.inline
  def apply(evaluateTargetHealth: scala.Boolean, name: java.lang.String, zoneId: java.lang.String): Anon_EvaluateTargetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluateTargetHealth")(evaluateTargetHealth)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[Anon_EvaluateTargetHealth]
  }
}

