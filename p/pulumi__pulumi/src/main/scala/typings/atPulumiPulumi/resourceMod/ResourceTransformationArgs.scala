package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTransformationArgs extends js.Object {
  /**
    * The name of the Resource.
    */
  var name: String
  /**
    * The original resource options passed to the Resource constructor.
    */
  var opts: ResourceOptions
  /**
    * The original properties passed to the Resource constructor.
    */
  var props: Inputs
  /**
    * The Resource instance that is being transformed.
    */
  var resource: Resource
  /**
    * The type of the Resource.
    */
  var `type`: String
}

object ResourceTransformationArgs {
  @scala.inline
  def apply(name: String, opts: ResourceOptions, props: Inputs, resource: Resource, `type`: String): ResourceTransformationArgs = {
    val __obj = js.Dynamic.literal(name = name, opts = opts, props = props, resource = resource)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceTransformationArgs]
  }
}

