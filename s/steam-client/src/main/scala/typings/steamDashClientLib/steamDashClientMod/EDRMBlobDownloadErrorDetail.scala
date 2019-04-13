package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends js.Object

@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends js.Object {
  @js.native
  sealed trait AppIdMismatch
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppIdUnexpected
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppliedSignatureCorrupt
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyMergeGuid
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplySignature
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyStrips
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyValveSignatureHeader
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait DownloadFailed
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait NextBase
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait OpenZip
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait PathManipulationError
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ReadZipDirectory
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Base
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Max
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnexpectedZipEntry
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnknownBlobType
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipFullFile
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipMergeGuid
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipSignature
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipStrips
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipValveSignatureHeader
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail
  
  /* 14 */ val AppIdMismatch: AppIdMismatch with scala.Double = js.native
  /* 15 */ val AppIdUnexpected: AppIdUnexpected with scala.Double = js.native
  /* 16 */ val AppliedSignatureCorrupt: AppliedSignatureCorrupt with scala.Double = js.native
  /* 12 */ val ApplyMergeGuid: ApplyMergeGuid with scala.Double = js.native
  /* 13 */ val ApplySignature: ApplySignature with scala.Double = js.native
  /* 11 */ val ApplyStrips: ApplyStrips with scala.Double = js.native
  /* 17 */ val ApplyValveSignatureHeader: ApplyValveSignatureHeader with scala.Double = js.native
  /* 1 */ val DownloadFailed: DownloadFailed with scala.Double = js.native
  /* 131072 */ val NextBase: NextBase with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val OpenZip: OpenZip with scala.Double = js.native
  /* 19 */ val PathManipulationError: PathManipulationError with scala.Double = js.native
  /* 4 */ val ReadZipDirectory: ReadZipDirectory with scala.Double = js.native
  /* 2 */ val TargetLocked: TargetLocked with scala.Double = js.native
  /* 65536 */ val TargetLocked_Base: TargetLocked_Base with scala.Double = js.native
  /* 131071 */ val TargetLocked_Max: TargetLocked_Max with scala.Double = js.native
  /* 5 */ val UnexpectedZipEntry: UnexpectedZipEntry with scala.Double = js.native
  /* 7 */ val UnknownBlobType: UnknownBlobType with scala.Double = js.native
  /* 6 */ val UnzipFullFile: UnzipFullFile with scala.Double = js.native
  /* 9 */ val UnzipMergeGuid: UnzipMergeGuid with scala.Double = js.native
  /* 10 */ val UnzipSignature: UnzipSignature with scala.Double = js.native
  /* 8 */ val UnzipStrips: UnzipStrips with scala.Double = js.native
  /* 18 */ val UnzipValveSignatureHeader: UnzipValveSignatureHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    steamDashClientLib.steamDashClientMod.EDRMBlobDownloadErrorDetail with scala.Double
  ] = js.native
}

