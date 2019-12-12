package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.AddTimestamp
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.AllMask
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Compressed
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Error
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.File
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.HighPriority
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.IsJob
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.LowPriority
import typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Parts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDRMBlobDownloadType extends js.Object

@JSImport("steam-client", "EDRMBlobDownloadType")
@js.native
object EDRMBlobDownloadType extends js.Object {
  @js.native
  sealed trait AddTimestamp extends EDRMBlobDownloadType
  
  @js.native
  sealed trait AllMask extends EDRMBlobDownloadType
  
  @js.native
  sealed trait Compressed extends EDRMBlobDownloadType
  
  @js.native
  sealed trait Error extends EDRMBlobDownloadType
  
  @js.native
  sealed trait File extends EDRMBlobDownloadType
  
  @js.native
  sealed trait HighPriority extends EDRMBlobDownloadType
  
  @js.native
  sealed trait IsJob extends EDRMBlobDownloadType
  
  @js.native
  sealed trait LowPriority extends EDRMBlobDownloadType
  
  @js.native
  sealed trait Parts extends EDRMBlobDownloadType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadType with Double] = js.native
  /* 32 */ @js.native
  object AddTimestamp extends TopLevel[AddTimestamp with Double]
  
  /* 7 */ @js.native
  object AllMask extends TopLevel[AllMask with Double]
  
  /* 4 */ @js.native
  object Compressed extends TopLevel[Compressed with Double]
  
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object File extends TopLevel[File with Double]
  
  /* 16 */ @js.native
  object HighPriority extends TopLevel[HighPriority with Double]
  
  /* 8 */ @js.native
  object IsJob extends TopLevel[IsJob with Double]
  
  /* 64 */ @js.native
  object LowPriority extends TopLevel[LowPriority with Double]
  
  /* 2 */ @js.native
  object Parts extends TopLevel[Parts with Double]
  
}

