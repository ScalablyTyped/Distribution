package typings.atPulumiAws.transferMod

import typings.atPulumiAws.transferGetServerMod.GetServerArgs
import typings.atPulumiAws.transferGetServerMod.GetServerResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/transfer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] with GetServerResult = js.native
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] with GetServerResult = js.native
}

