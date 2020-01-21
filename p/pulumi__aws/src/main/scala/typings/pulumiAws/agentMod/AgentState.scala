package typings.pulumiAws.agentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentState extends js.Object {
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Agent.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DataSync Agent.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object AgentState {
  @scala.inline
  def apply(
    activationKey: Input[String] = null,
    arn: Input[String] = null,
    ipAddress: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): AgentState = {
    val __obj = js.Dynamic.literal()
    if (activationKey != null) __obj.updateDynamic("activationKey")(activationKey.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentState]
  }
}

