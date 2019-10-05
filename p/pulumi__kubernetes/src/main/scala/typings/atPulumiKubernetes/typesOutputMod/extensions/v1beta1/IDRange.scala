package typings.atPulumiKubernetes.typesOutputMod.extensions.v1beta1

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
  val max: Double
  /**
    * min is the start of the range, inclusive.
    */
  val min: Double
}

object IDRange {
  @scala.inline
  def apply(max: Double, min: Double): IDRange = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IDRange]
  }
}

