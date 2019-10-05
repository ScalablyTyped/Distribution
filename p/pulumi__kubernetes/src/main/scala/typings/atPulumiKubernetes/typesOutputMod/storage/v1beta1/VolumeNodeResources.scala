package typings.atPulumiKubernetes.typesOutputMod.storage.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeNodeResources is a set of resource limits for scheduling of volumes.
  */
trait VolumeNodeResources extends js.Object {
  /**
    * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A
    * volume that is both attached and mounted on a node is considered to be used once, not
    * twice. The same rule applies for a unique volume that is shared among multiple pods on the
    * same node. If this field is nil, then the supported number of volumes on this node is
    * unbounded.
    */
  val count: Double
}

object VolumeNodeResources {
  @scala.inline
  def apply(count: Double): VolumeNodeResources = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[VolumeNodeResources]
  }
}

