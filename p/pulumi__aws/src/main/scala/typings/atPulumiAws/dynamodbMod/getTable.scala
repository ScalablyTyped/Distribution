package typings.atPulumiAws.dynamodbMod

import typings.atPulumiAws.dynamodbGetTableMod.GetTableArgs
import typings.atPulumiAws.dynamodbGetTableMod.GetTableResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "getTable")
@js.native
object getTable extends js.Object {
  def apply(args: GetTableArgs): js.Promise[GetTableResult] with GetTableResult = js.native
  def apply(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] with GetTableResult = js.native
}

