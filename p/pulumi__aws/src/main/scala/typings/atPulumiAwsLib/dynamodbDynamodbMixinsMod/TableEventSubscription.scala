package typings
package atPulumiAwsLib.dynamodbDynamodbMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/dynamodbMixins", "TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, table: atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table, handler: TableEventHandler, args: TableEventSubscriptionArgs) = this()
  def this(name: java.lang.String, table: atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table, handler: TableEventHandler, args: TableEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  val eventSourceMapping: atPulumiAwsLib.lambdaMod.EventSourceMapping = js.native
  val table: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table] = js.native
}

