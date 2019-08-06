package typings.atPulumiAws.cfgAggregateAuthorizationMod

import org.scalablytyped.runtime.StringDictionary
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
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object AggregateAuthorizationArgs {
  @scala.inline
  def apply(accountId: Input[String], region: Input[String], tags: Input[StringDictionary[_]] = null): AggregateAuthorizationArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateAuthorizationArgs]
  }
}

