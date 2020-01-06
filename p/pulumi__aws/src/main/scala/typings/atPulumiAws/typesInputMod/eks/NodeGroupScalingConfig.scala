package typings.atPulumiAws.typesInputMod.eks

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupScalingConfig extends js.Object {
  /**
    * Desired number of worker nodes.
    */
  var desiredSize: Input[Double] = js.native
  /**
    * Maximum number of worker nodes.
    */
  var maxSize: Input[Double] = js.native
  /**
    * Minimum number of worker nodes.
    */
  var minSize: Input[Double] = js.native
}

object NodeGroupScalingConfig {
  @scala.inline
  def apply(desiredSize: Input[Double], maxSize: Input[Double], minSize: Input[Double]): NodeGroupScalingConfig = {
    val __obj = js.Dynamic.literal(desiredSize = desiredSize.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeGroupScalingConfig]
  }
}

