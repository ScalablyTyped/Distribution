package typings.atPulumiAws.cloudformationStackSetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSetInstanceState extends js.Object {
  /**
    * Target AWS Account ID to create a Stack based on the Stack Set. Defaults to current account.
    */
  val accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value map of input parameters to override from the Stack Set for this Instance.
    */
  val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Target AWS Region to create a Stack based on the Stack Set. Defaults to current region.
    */
  val region: js.UndefOr[Input[String]] = js.undefined
  val retainStack: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Stack identifier
    */
  val stackId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the Stack Set.
    */
  val stackSetName: js.UndefOr[Input[String]] = js.undefined
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

