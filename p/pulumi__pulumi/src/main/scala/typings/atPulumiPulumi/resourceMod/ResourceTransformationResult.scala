package typings.atPulumiPulumi.resourceMod

import typings.atPulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTransformationResult extends js.Object {
  /**
    * The new resource options to use in place of the original `opts`
    */
  var opts: ResourceOptions
  /**
    * The new properties to use in place of the original `props`
    */
  var props: Inputs
}

object ResourceTransformationResult {
  @scala.inline
  def apply(opts: ResourceOptions, props: Inputs): ResourceTransformationResult = {
    val __obj = js.Dynamic.literal(opts = opts, props = props)
  
    __obj.asInstanceOf[ResourceTransformationResult]
  }
}

