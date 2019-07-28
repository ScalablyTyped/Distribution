package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvaluateTargetHealthName extends js.Object {
  var evaluateTargetHealth: Input[Boolean]
  var name: Input[String]
  var zoneId: Input[String]
}

object Anon_EvaluateTargetHealthName {
  @scala.inline
  def apply(evaluateTargetHealth: Input[Boolean], name: Input[String], zoneId: Input[String]): Anon_EvaluateTargetHealthName = {
    val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EvaluateTargetHealthName]
  }
}

