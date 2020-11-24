package typings.pulumiAws.dynamodbMod

import typings.pulumiAws.getTableMod.GetTableArgs
import typings.pulumiAws.getTableMod.GetTableResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/dynamodb", "getTable")
@js.native
object getTable extends js.Object {
  
  def apply(args: GetTableArgs): js.Promise[GetTableResult] = js.native
  def apply(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] = js.native
}
