package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
trait LimitRangeSpec extends js.Object {
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  val limits: js.Array[LimitRangeItem]
}

object LimitRangeSpec {
  @scala.inline
  def apply(limits: js.Array[LimitRangeItem]): LimitRangeSpec = {
    val __obj = js.Dynamic.literal(limits = limits)
  
    __obj.asInstanceOf[LimitRangeSpec]
  }
}

