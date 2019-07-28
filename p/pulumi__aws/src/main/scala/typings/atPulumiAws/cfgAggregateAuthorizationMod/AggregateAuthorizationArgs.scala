package typings.atPulumiAws.cfgAggregateAuthorizationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateAuthorizationArgs extends js.Object {
  /**
    * Account ID
    */
  val accountId: Input[String]
  /**
    * Region
    */
  val region: Input[String]
}

object AggregateAuthorizationArgs {
  @scala.inline
  def apply(accountId: Input[String], region: Input[String]): AggregateAuthorizationArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregateAuthorizationArgs]
  }
}

