package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.getKeyMod.GetKeyArgs
import typings.pulumiAws.getKeyMod.GetKeyResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "getKey")
@js.native
object getKey extends js.Object {
  def apply(args: GetKeyArgs): js.Promise[GetKeyResult] = js.native
  def apply(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = js.native
}

