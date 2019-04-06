package typings
package atPulumiAwsLib.cloudformationStackSetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSetInstanceArgs extends js.Object {
  /**
    * Target AWS Account ID to create a Stack based on the Stack Set. Defaults to current account.
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Key-value map of input parameters to override from the Stack Set for this Instance.
    */
  val parameterOverrides: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Target AWS Region to create a Stack based on the Stack Set. Defaults to current region.
    */
  val region: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * During Terraform resource destroy, remove Instance from Stack Set while keeping the Stack and its associated resources. Must be enabled in Terraform state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new Stack Set. Defaults to `false`.
    */
  val retainStack: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Name of the Stack Set.
    */
  val stackSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object StackSetInstanceArgs {
  @scala.inline
  def apply(
    stackSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parameterOverrides: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    region: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    retainStack: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): StackSetInstanceArgs = {
    val __obj = js.Dynamic.literal(stackSetName = stackSetName.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (parameterOverrides != null) __obj.updateDynamic("parameterOverrides")(parameterOverrides.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retainStack != null) __obj.updateDynamic("retainStack")(retainStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetInstanceArgs]
  }
}

