package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleSpec describes the attributes of a scale subresource
  */
trait ScaleSpec extends js.Object {
  /**
    * desired number of instances for the scaled object.
    */
  val replicas: scala.Double
}

object ScaleSpec {
  @scala.inline
  def apply(replicas: scala.Double): ScaleSpec = {
    val __obj = js.Dynamic.literal(replicas = replicas)
  
    __obj.asInstanceOf[ScaleSpec]
  }
}

