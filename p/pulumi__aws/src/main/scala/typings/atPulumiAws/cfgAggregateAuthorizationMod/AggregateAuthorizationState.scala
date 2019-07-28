package typings.atPulumiAws.cfgAggregateAuthorizationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateAuthorizationState extends js.Object {
  /**
    * Account ID
    */
  val accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the authorization
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Region
    */
  val region: js.UndefOr[Input[String]] = js.undefined
}

object AggregateAuthorizationState {
  @scala.inline
  def apply(accountId: Input[String] = null, arn: Input[String] = null, region: Input[String] = null): AggregateAuthorizationState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateAuthorizationState]
  }
}

