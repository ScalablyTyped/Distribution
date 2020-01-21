package typings.pulumiAws.stackSetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetInstanceState extends js.Object {
  /**
    * Target AWS Account ID to create a Stack based on the Stack Set. Defaults to current account.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of input parameters to override from the Stack Set for this Instance.
    */
  val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Target AWS Region to create a Stack based on the Stack Set. Defaults to current region.
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * During resource destroy, remove Instance from Stack Set while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new Stack Set. Defaults to `false`.
    */
  val retainStack: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Stack identifier
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the Stack Set.
    */
  val stackSetName: js.UndefOr[Input[String]] = js.native
}

object StackSetInstanceState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    parameterOverrides: Input[StringDictionary[Input[String]]] = null,
    region: Input[String] = null,
    retainStack: Input[Boolean] = null,
    stackId: Input[String] = null,
    stackSetName: Input[String] = null
  ): StackSetInstanceState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (parameterOverrides != null) __obj.updateDynamic("parameterOverrides")(parameterOverrides.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retainStack != null) __obj.updateDynamic("retainStack")(retainStack.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (stackSetName != null) __obj.updateDynamic("stackSetName")(stackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetInstanceState]
  }
}

