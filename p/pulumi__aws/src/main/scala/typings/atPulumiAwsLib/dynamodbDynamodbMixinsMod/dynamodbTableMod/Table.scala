package typings
package atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * Creates a new subscription to events fired from this Table to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * In order to receive events the [Table] must have been created with the `streamEnabled: true`
    * value as well as an appropriate `streamViewType`.
    */
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler,
    args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler,
    args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscription = js.native
}

