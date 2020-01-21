package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
  /* 14 */ @js.native
  object AppIdMismatch extends TopLevel[AppIdMismatch with Double]
  
  /* 15 */ @js.native
  object AppIdUnexpected extends TopLevel[AppIdUnexpected with Double]
  
  /* 16 */ @js.native
  object AppliedSignatureCorrupt extends TopLevel[AppliedSignatureCorrupt with Double]
  
  /* 12 */ @js.native
  object ApplyMergeGuid extends TopLevel[ApplyMergeGuid with Double]
  
  /* 13 */ @js.native
  object ApplySignature extends TopLevel[ApplySignature with Double]
  
  /* 11 */ @js.native
  object ApplyStrips extends TopLevel[ApplyStrips with Double]
  
  /* 17 */ @js.native
  object ApplyValveSignatureHeader extends TopLevel[ApplyValveSignatureHeader with Double]
  
  /* 1 */ @js.native
  object DownloadFailed extends TopLevel[DownloadFailed with Double]
  
  /* 131072 */ @js.native
  object NextBase extends TopLevel[NextBase with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object OpenZip extends TopLevel[OpenZip with Double]
  
  /* 19 */ @js.native
  object PathManipulationError extends TopLevel[PathManipulationError with Double]
  
  /* 4 */ @js.native
  object ReadZipDirectory extends TopLevel[ReadZipDirectory with Double]
  
  /* 2 */ @js.native
  object TargetLocked extends TopLevel[TargetLocked with Double]
  
  /* 65536 */ @js.native
  object TargetLocked_Base extends TopLevel[TargetLocked_Base with Double]
  
  /* 131071 */ @js.native
  object TargetLocked_Max extends TopLevel[TargetLocked_Max with Double]
  
  /* 5 */ @js.native
  object UnexpectedZipEntry extends TopLevel[UnexpectedZipEntry with Double]
  
  /* 7 */ @js.native
  object UnknownBlobType extends TopLevel[UnknownBlobType with Double]
  
  /* 6 */ @js.native
  object UnzipFullFile extends TopLevel[UnzipFullFile with Double]
  
  /* 9 */ @js.native
  object UnzipMergeGuid extends TopLevel[UnzipMergeGuid with Double]
  
  /* 10 */ @js.native
  object UnzipSignature extends TopLevel[UnzipSignature with Double]
  
  /* 8 */ @js.native
  object UnzipStrips extends TopLevel[UnzipStrips with Double]
  
  /* 18 */ @js.native
  object UnzipValveSignatureHeader extends TopLevel[UnzipValveSignatureHeader with Double]
  
}

