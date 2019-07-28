package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvaluateTargetHealth extends js.Object {
  var evaluateTargetHealth: Boolean
  var name: String
  var zoneId: String
}

object Anon_EvaluateTargetHealth {
  @scala.inline
  def apply(evaluateTargetHealth: Boolean, name: String, zoneId: String): Anon_EvaluateTargetHealth = {
    val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth, name = name, zoneId = zoneId)
  
    __obj.asInstanceOf[Anon_EvaluateTargetHealth]
  }
}

