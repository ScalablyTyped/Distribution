package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val containerName: java.lang.String
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  val divisor: java.lang.String
  /**
    * Required: resource to select
    */
  val resource: java.lang.String
}

object ResourceFieldSelector {
  @scala.inline
  def apply(containerName: java.lang.String, divisor: java.lang.String, resource: java.lang.String): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerName")(containerName)
    __obj.updateDynamic("divisor")(divisor)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ResourceFieldSelector]
  }
}

