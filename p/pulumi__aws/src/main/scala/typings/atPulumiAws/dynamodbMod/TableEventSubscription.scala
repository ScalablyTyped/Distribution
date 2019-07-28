package typings.atPulumiAws.dynamodbMod

import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventHandler
import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscription {
  def this(
    name: String,
    table: typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    table: typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

