package typings.atPulumiAws.efsMod

import typings.atPulumiAws.efsGetFileSystemMod.GetFileSystemArgs
import typings.atPulumiAws.efsGetFileSystemMod.GetFileSystemResult
import typings.atPulumiAws.efsGetMountTargetMod.GetMountTargetArgs
import typings.atPulumiAws.efsGetMountTargetMod.GetMountTargetResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFileSystem(): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
}

