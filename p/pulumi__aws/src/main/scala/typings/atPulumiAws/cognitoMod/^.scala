package typings.atPulumiAws.cognitoMod

import typings.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsArgs
import typings.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
}

