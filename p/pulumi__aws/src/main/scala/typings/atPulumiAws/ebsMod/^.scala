package typings.atPulumiAws.ebsMod

import typings.atPulumiAws.ebsGetDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typings.atPulumiAws.ebsGetEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typings.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsArgs
import typings.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsResult
import typings.atPulumiAws.ebsGetSnapshotMod.GetSnapshotArgs
import typings.atPulumiAws.ebsGetSnapshotMod.GetSnapshotResult
import typings.atPulumiAws.ebsGetVolumeMod.GetVolumeArgs
import typings.atPulumiAws.ebsGetVolumeMod.GetVolumeResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getVolume(): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
}

