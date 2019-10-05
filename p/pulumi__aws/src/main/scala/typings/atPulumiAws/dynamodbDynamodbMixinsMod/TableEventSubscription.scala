package typings.atPulumiAws.dynamodbDynamodbMixinsMod

import typings.atPulumiAws.dynamodbTableMod.Table
import typings.atPulumiAws.lambdaMod.EventSourceMapping
import typings.atPulumiAws.lambdaMod.EventSubscription
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/dynamodbMixins", "TableEventSubscription")
@js.native
class TableEventSubscription protected () extends EventSubscription {
  def this(name: String, table: Table, handler: TableEventHandler, args: TableEventSubscriptionArgs) = this()
  def this(
    name: String,
    table: Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val eventSourceMapping: EventSourceMapping = js.native
  val table: Table = js.native
}

