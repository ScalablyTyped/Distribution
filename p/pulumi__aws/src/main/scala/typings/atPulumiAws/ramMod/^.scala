package typings.atPulumiAws.ramMod

import typings.atPulumiAws.ramGetResourceShareMod.GetResourceShareArgs
import typings.atPulumiAws.ramGetResourceShareMod.GetResourceShareResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] with GetResourceShareResult = js.native
  def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] with GetResourceShareResult = js.native
}

