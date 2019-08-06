package typings.atPulumiAws.datasyncAgentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentArgs extends js.Object {
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
    */
  val activationKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the DataSync Agent.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object AgentArgs {
  @scala.inline
  def apply(
    activationKey: Input[String] = null,
    ipAddress: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): AgentArgs = {
    val __obj = js.Dynamic.literal()
    if (activationKey != null) __obj.updateDynamic("activationKey")(activationKey.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentArgs]
  }
}

