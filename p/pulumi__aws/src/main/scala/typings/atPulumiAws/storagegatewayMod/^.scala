package typings.atPulumiAws.storagegatewayMod

import typings.atPulumiAws.storagegatewayGetLocalDiskMod.GetLocalDiskArgs
import typings.atPulumiAws.storagegatewayGetLocalDiskMod.GetLocalDiskResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
}

