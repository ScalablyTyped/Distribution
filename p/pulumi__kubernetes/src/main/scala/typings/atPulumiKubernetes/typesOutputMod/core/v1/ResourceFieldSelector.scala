package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val containerName: String
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  val divisor: String
  /**
    * Required: resource to select
    */
  val resource: String
}

object ResourceFieldSelector {
  @scala.inline
  def apply(containerName: String, divisor: String, resource: String): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(containerName = containerName, divisor = divisor, resource = resource)
  
    __obj.asInstanceOf[ResourceFieldSelector]
  }
}

