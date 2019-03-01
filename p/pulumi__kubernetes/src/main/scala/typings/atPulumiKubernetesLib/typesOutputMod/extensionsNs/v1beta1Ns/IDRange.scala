package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy
  * API Group instead.
  */
trait IDRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  val max: scala.Double
  /**
    * min is the start of the range, inclusive.
    */
  val min: scala.Double
}

object IDRange {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): IDRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[IDRange]
  }
}

