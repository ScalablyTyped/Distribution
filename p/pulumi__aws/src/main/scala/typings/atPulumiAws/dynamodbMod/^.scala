package typings.atPulumiAws.dynamodbMod

import typings.atPulumiAws.dynamodbGetTableMod.GetTableArgs
import typings.atPulumiAws.dynamodbGetTableMod.GetTableResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getTable(args: GetTableArgs): js.Promise[GetTableResult] with GetTableResult = js.native
  def getTable(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] with GetTableResult = js.native
}

