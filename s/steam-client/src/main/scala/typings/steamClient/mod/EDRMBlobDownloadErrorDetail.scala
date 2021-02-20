package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends StObject
@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
  
  @js.native
  sealed trait AppIdMismatch extends EDRMBlobDownloadErrorDetail
  /* 14 */ val AppIdMismatch: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdMismatch with Double = js.native
  
  @js.native
  sealed trait AppIdUnexpected extends EDRMBlobDownloadErrorDetail
  /* 15 */ val AppIdUnexpected: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdUnexpected with Double = js.native
  
  @js.native
  sealed trait AppliedSignatureCorrupt extends EDRMBlobDownloadErrorDetail
  /* 16 */ val AppliedSignatureCorrupt: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt with Double = js.native
  
  @js.native
  sealed trait ApplyMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 12 */ val ApplyMergeGuid: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid with Double = js.native
  
  @js.native
  sealed trait ApplySignature extends EDRMBlobDownloadErrorDetail
  /* 13 */ val ApplySignature: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplySignature with Double = js.native
  
  @js.native
  sealed trait ApplyStrips extends EDRMBlobDownloadErrorDetail
  /* 11 */ val ApplyStrips: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyStrips with Double = js.native
  
  @js.native
  sealed trait ApplyValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 17 */ val ApplyValveSignatureHeader: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader with Double = js.native
  
  @js.native
  sealed trait DownloadFailed extends EDRMBlobDownloadErrorDetail
  /* 1 */ val DownloadFailed: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.DownloadFailed with Double = js.native
  
  @js.native
  sealed trait NextBase extends EDRMBlobDownloadErrorDetail
  /* 131072 */ val NextBase: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.NextBase with Double = js.native
  
  @js.native
  sealed trait None extends EDRMBlobDownloadErrorDetail
  /* 0 */ val None: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.None with Double = js.native
  
  @js.native
  sealed trait OpenZip extends EDRMBlobDownloadErrorDetail
  /* 3 */ val OpenZip: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.OpenZip with Double = js.native
  
  @js.native
  sealed trait PathManipulationError extends EDRMBlobDownloadErrorDetail
  /* 19 */ val PathManipulationError: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.PathManipulationError with Double = js.native
  
  @js.native
  sealed trait ReadZipDirectory extends EDRMBlobDownloadErrorDetail
  /* 4 */ val ReadZipDirectory: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.ReadZipDirectory with Double = js.native
  
  @js.native
  sealed trait TargetLocked extends EDRMBlobDownloadErrorDetail
  /* 2 */ val TargetLocked: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked with Double = js.native
  
  @js.native
  sealed trait TargetLocked_Base extends EDRMBlobDownloadErrorDetail
  /* 65536 */ val TargetLocked_Base: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Base with Double = js.native
  
  @js.native
  sealed trait TargetLocked_Max extends EDRMBlobDownloadErrorDetail
  /* 131071 */ val TargetLocked_Max: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Max with Double = js.native
  
  @js.native
  sealed trait UnexpectedZipEntry extends EDRMBlobDownloadErrorDetail
  /* 5 */ val UnexpectedZipEntry: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry with Double = js.native
  
  @js.native
  sealed trait UnknownBlobType extends EDRMBlobDownloadErrorDetail
  /* 7 */ val UnknownBlobType: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnknownBlobType with Double = js.native
  
  @js.native
  sealed trait UnzipFullFile extends EDRMBlobDownloadErrorDetail
  /* 6 */ val UnzipFullFile: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipFullFile with Double = js.native
  
  @js.native
  sealed trait UnzipMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 9 */ val UnzipMergeGuid: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid with Double = js.native
  
  @js.native
  sealed trait UnzipSignature extends EDRMBlobDownloadErrorDetail
  /* 10 */ val UnzipSignature: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipSignature with Double = js.native
  
  @js.native
  sealed trait UnzipStrips extends EDRMBlobDownloadErrorDetail
  /* 8 */ val UnzipStrips: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipStrips with Double = js.native
  
  @js.native
  sealed trait UnzipValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 18 */ val UnzipValveSignatureHeader: typings.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader with Double = js.native
}
