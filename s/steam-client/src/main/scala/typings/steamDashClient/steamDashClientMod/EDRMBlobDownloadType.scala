package typings.steamDashClient.steamDashClientMod

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
  
  /* 32 */ val AddTimestamp: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.AddTimestamp with Double = js.native
  /* 7 */ val AllMask: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.AllMask with Double = js.native
  /* 4 */ val Compressed: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Compressed with Double = js.native
  /* 0 */ val Error: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Error with Double = js.native
  /* 1 */ val File: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.File with Double = js.native
  /* 16 */ val HighPriority: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.HighPriority with Double = js.native
  /* 8 */ val IsJob: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.IsJob with Double = js.native
  /* 64 */ val LowPriority: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.LowPriority with Double = js.native
  /* 2 */ val Parts: typings.steamDashClient.steamDashClientMod.EDRMBlobDownloadType.Parts with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadType with Double] = js.native
}

