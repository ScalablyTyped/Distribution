package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
  */
trait PriorityLevelConfigurationSpec extends js.Object {
  /**
    * `limited` specifies how requests are handled for a Limited priority level. This field must
    * be non-empty if and only if `type` is `"Limited"`.
    */
  val limited: LimitedPriorityLevelConfiguration
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.
    * A value of `"Exempt"` means that requests of this priority level are not subject to a limit
    * (and thus are never queued) and do not detract from the capacity made available to other
    * priority levels.  A value of `"Limited"` means that (a) requests of this priority level
    * _are_ subject to limits and (b) some of the server's limited capacity is made available
    * exclusively to this priority level. Required.
    */
  val `type`: String
}

object PriorityLevelConfigurationSpec {
  @scala.inline
  def apply(limited: LimitedPriorityLevelConfiguration, `type`: String): PriorityLevelConfigurationSpec = {
    val __obj = js.Dynamic.literal(limited = limited.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationSpec]
  }
}

