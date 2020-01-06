package typings.atPulumiAws.typesOutputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupScalingConfig extends js.Object {
  /**
    * Desired number of worker nodes.
    */
  var desiredSize: Double = js.native
  /**
    * Maximum number of worker nodes.
    */
  var maxSize: Double = js.native
  /**
    * Minimum number of worker nodes.
    */
  var minSize: Double = js.native
}

object NodeGroupScalingConfig {
  @scala.inline
  def apply(desiredSize: Double, maxSize: Double, minSize: Double): NodeGroupScalingConfig = {
    val __obj = js.Dynamic.literal(desiredSize = desiredSize.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeGroupScalingConfig]
  }
}

