package typings.pulumiAws.mod.dynamodb

import typings.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typings.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb.TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends typings.pulumiAws.dynamodbMod.TableEventSubscription {
  def this(
    name: String,
    table: typings.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    table: typings.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

