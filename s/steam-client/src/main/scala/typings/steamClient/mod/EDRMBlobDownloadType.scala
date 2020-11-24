package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadType extends js.Object
@JSImport("steam-client", "EDRMBlobDownloadType")
@js.native
object EDRMBlobDownloadType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadType with Double] = js.native
  
  @js.native
  sealed trait AddTimestamp extends EDRMBlobDownloadType
  /* 32 */ @js.native
  object AddTimestamp extends TopLevel[AddTimestamp with Double]
  
  @js.native
  sealed trait AllMask extends EDRMBlobDownloadType
  /* 7 */ @js.native
  object AllMask extends TopLevel[AllMask with Double]
  
  @js.native
  sealed trait Compressed extends EDRMBlobDownloadType
  /* 4 */ @js.native
  object Compressed extends TopLevel[Compressed with Double]
  
  @js.native
  sealed trait Error extends EDRMBlobDownloadType
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait File extends EDRMBlobDownloadType
  /* 1 */ @js.native
  object File extends TopLevel[File with Double]
  
  @js.native
  sealed trait HighPriority extends EDRMBlobDownloadType
  /* 16 */ @js.native
  object HighPriority extends TopLevel[HighPriority with Double]
  
  @js.native
  sealed trait IsJob extends EDRMBlobDownloadType
  /* 8 */ @js.native
  object IsJob extends TopLevel[IsJob with Double]
  
  @js.native
  sealed trait LowPriority extends EDRMBlobDownloadType
  /* 64 */ @js.native
  object LowPriority extends TopLevel[LowPriority with Double]
  
  @js.native
  sealed trait Parts extends EDRMBlobDownloadType
  /* 2 */ @js.native
  object Parts extends TopLevel[Parts with Double]
}
