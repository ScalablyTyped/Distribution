package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
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
  var limited: js.UndefOr[Input[LimitedPriorityLevelConfiguration]] = js.undefined
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.
    * A value of `"Exempt"` means that requests of this priority level are not subject to a limit
    * (and thus are never queued) and do not detract from the capacity made available to other
    * priority levels.  A value of `"Limited"` means that (a) requests of this priority level
    * _are_ subject to limits and (b) some of the server's limited capacity is made available
    * exclusively to this priority level. Required.
    */
  var `type`: Input[String]
}

object PriorityLevelConfigurationSpec {
  @scala.inline
  def apply(`type`: Input[String], limited: Input[LimitedPriorityLevelConfiguration] = null): PriorityLevelConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (limited != null) __obj.updateDynamic("limited")(limited.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationSpec]
  }
}

