package typings.pulumiAws.dynamodbMixinsMod

import typings.pulumiAws.lambdaMod.EventSourceMapping
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.tableMod.Table
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
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

