package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends js.Object
@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
  
  @js.native
  sealed trait AppIdMismatch extends EDRMBlobDownloadErrorDetail
  /* 14 */ @js.native
  object AppIdMismatch extends TopLevel[AppIdMismatch with Double]
  
  @js.native
  sealed trait AppIdUnexpected extends EDRMBlobDownloadErrorDetail
  /* 15 */ @js.native
  object AppIdUnexpected extends TopLevel[AppIdUnexpected with Double]
  
  @js.native
  sealed trait AppliedSignatureCorrupt extends EDRMBlobDownloadErrorDetail
  /* 16 */ @js.native
  object AppliedSignatureCorrupt extends TopLevel[AppliedSignatureCorrupt with Double]
  
  @js.native
  sealed trait ApplyMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 12 */ @js.native
  object ApplyMergeGuid extends TopLevel[ApplyMergeGuid with Double]
  
  @js.native
  sealed trait ApplySignature extends EDRMBlobDownloadErrorDetail
  /* 13 */ @js.native
  object ApplySignature extends TopLevel[ApplySignature with Double]
  
  @js.native
  sealed trait ApplyStrips extends EDRMBlobDownloadErrorDetail
  /* 11 */ @js.native
  object ApplyStrips extends TopLevel[ApplyStrips with Double]
  
  @js.native
  sealed trait ApplyValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 17 */ @js.native
  object ApplyValveSignatureHeader extends TopLevel[ApplyValveSignatureHeader with Double]
  
  @js.native
  sealed trait DownloadFailed extends EDRMBlobDownloadErrorDetail
  /* 1 */ @js.native
  object DownloadFailed extends TopLevel[DownloadFailed with Double]
  
  @js.native
  sealed trait NextBase extends EDRMBlobDownloadErrorDetail
  /* 131072 */ @js.native
  object NextBase extends TopLevel[NextBase with Double]
  
  @js.native
  sealed trait None extends EDRMBlobDownloadErrorDetail
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OpenZip extends EDRMBlobDownloadErrorDetail
  /* 3 */ @js.native
  object OpenZip extends TopLevel[OpenZip with Double]
  
  @js.native
  sealed trait PathManipulationError extends EDRMBlobDownloadErrorDetail
  /* 19 */ @js.native
  object PathManipulationError extends TopLevel[PathManipulationError with Double]
  
  @js.native
  sealed trait ReadZipDirectory extends EDRMBlobDownloadErrorDetail
  /* 4 */ @js.native
  object ReadZipDirectory extends TopLevel[ReadZipDirectory with Double]
  
  @js.native
  sealed trait TargetLocked extends EDRMBlobDownloadErrorDetail
  /* 2 */ @js.native
  object TargetLocked extends TopLevel[TargetLocked with Double]
  
  @js.native
  sealed trait TargetLocked_Base extends EDRMBlobDownloadErrorDetail
  /* 65536 */ @js.native
  object TargetLocked_Base extends TopLevel[TargetLocked_Base with Double]
  
  @js.native
  sealed trait TargetLocked_Max extends EDRMBlobDownloadErrorDetail
  /* 131071 */ @js.native
  object TargetLocked_Max extends TopLevel[TargetLocked_Max with Double]
  
  @js.native
  sealed trait UnexpectedZipEntry extends EDRMBlobDownloadErrorDetail
  /* 5 */ @js.native
  object UnexpectedZipEntry extends TopLevel[UnexpectedZipEntry with Double]
  
  @js.native
  sealed trait UnknownBlobType extends EDRMBlobDownloadErrorDetail
  /* 7 */ @js.native
  object UnknownBlobType extends TopLevel[UnknownBlobType with Double]
  
  @js.native
  sealed trait UnzipFullFile extends EDRMBlobDownloadErrorDetail
  /* 6 */ @js.native
  object UnzipFullFile extends TopLevel[UnzipFullFile with Double]
  
  @js.native
  sealed trait UnzipMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 9 */ @js.native
  object UnzipMergeGuid extends TopLevel[UnzipMergeGuid with Double]
  
  @js.native
  sealed trait UnzipSignature extends EDRMBlobDownloadErrorDetail
  /* 10 */ @js.native
  object UnzipSignature extends TopLevel[UnzipSignature with Double]
  
  @js.native
  sealed trait UnzipStrips extends EDRMBlobDownloadErrorDetail
  /* 8 */ @js.native
  object UnzipStrips extends TopLevel[UnzipStrips with Double]
  
  @js.native
  sealed trait UnzipValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 18 */ @js.native
  object UnzipValveSignatureHeader extends TopLevel[UnzipValveSignatureHeader with Double]
}
