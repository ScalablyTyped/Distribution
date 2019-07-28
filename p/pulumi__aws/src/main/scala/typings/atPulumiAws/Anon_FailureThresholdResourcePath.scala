package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThresholdResourcePath extends js.Object {
  var failureThreshold: js.UndefOr[Input[Double]] = js.undefined
  var resourcePath: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_FailureThresholdResourcePath {
  @scala.inline
  def apply(
    failureThreshold: Input[Double] = null,
    resourcePath: Input[String] = null,
    `type`: Input[String] = null
  ): Anon_FailureThresholdResourcePath = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailureThresholdResourcePath]
  }
}

