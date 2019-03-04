package typings
package atPulumiAwsLib.cfgAggregateAuthorizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateAuthorizationArgs extends js.Object {
  /**
    * Account ID
    */
  val accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Region
    */
  val region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AggregateAuthorizationArgs {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): AggregateAuthorizationArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregateAuthorizationArgs]
  }
}

