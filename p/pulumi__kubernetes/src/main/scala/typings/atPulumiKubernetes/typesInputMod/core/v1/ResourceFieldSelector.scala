package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceFieldSelector represents container resources (cpu, memory) and their output format
  */
trait ResourceFieldSelector extends js.Object {
  /**
    * Container name: required for volumes, optional for env vars
    */
  var containerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  var divisor: js.UndefOr[Input[String]] = js.undefined
  /**
    * Required: resource to select
    */
  var resource: Input[String]
}

object ResourceFieldSelector {
  @scala.inline
  def apply(resource: Input[String], containerName: Input[String] = null, divisor: Input[String] = null): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFieldSelector]
  }
}

