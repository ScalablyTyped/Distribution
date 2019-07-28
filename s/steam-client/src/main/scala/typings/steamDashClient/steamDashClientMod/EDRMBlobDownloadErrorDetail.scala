package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends js.Object

@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends js.Object {
  @js.native
  sealed trait AppIdMismatch extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppIdUnexpected extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppliedSignatureCorrupt extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyMergeGuid extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplySignature extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyStrips extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait DownloadFailed extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait NextBase extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait None extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait OpenZip extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait PathManipulationError extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ReadZipDirectory extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Base extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Max extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnexpectedZipEntry extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnknownBlobType extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipFullFile extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipMergeGuid extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipSignature extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipStrips extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  
  /* 14 */ val AppIdMismatch: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppIdMismatch with Double = js.native
  /* 15 */ val AppIdUnexpected: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppIdUnexpected with Double = js.native
  /* 16 */ val AppliedSignatureCorrupt: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt with Double = js.native
  /* 12 */ val ApplyMergeGuid: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid with Double = js.native
  /* 13 */ val ApplySignature: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplySignature with Double = js.native
  /* 11 */ val ApplyStrips: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyStrips with Double = js.native
  /* 17 */ val ApplyValveSignatureHeader: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader with Double = js.native
  /* 1 */ val DownloadFailed: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.DownloadFailed with Double = js.native
  /* 131072 */ val NextBase: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.NextBase with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.None with Double = js.native
  /* 3 */ val OpenZip: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.OpenZip with Double = js.native
  /* 19 */ val PathManipulationError: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.PathManipulationError with Double = js.native
  /* 4 */ val ReadZipDirectory: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ReadZipDirectory with Double = js.native
  /* 2 */ val TargetLocked: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked with Double = js.native
  /* 65536 */ val TargetLocked_Base: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked_Base with Double = js.native
  /* 131071 */ val TargetLocked_Max: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked_Max with Double = js.native
  /* 5 */ val UnexpectedZipEntry: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry with Double = js.native
  /* 7 */ val UnknownBlobType: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnknownBlobType with Double = js.native
  /* 6 */ val UnzipFullFile: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipFullFile with Double = js.native
  /* 9 */ val UnzipMergeGuid: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid with Double = js.native
  /* 10 */ val UnzipSignature: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipSignature with Double = js.native
  /* 8 */ val UnzipStrips: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipStrips with Double = js.native
  /* 18 */ val UnzipValveSignatureHeader: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
}

