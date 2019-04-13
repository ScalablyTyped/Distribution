package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDRMBlobDownloadType extends js.Object

@JSImport("steam-client", "EDRMBlobDownloadType")
@js.native
object EDRMBlobDownloadType extends js.Object {
  @js.native
  sealed trait AddTimestamp
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait AllMask
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait Compressed
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait Error
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait File
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait HighPriority
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait IsJob
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait LowPriority
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  @js.native
  sealed trait Parts
    extends steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType
  
  /* 32 */ val AddTimestamp: AddTimestamp with scala.Double = js.native
  /* 7 */ val AllMask: AllMask with scala.Double = js.native
  /* 4 */ val Compressed: Compressed with scala.Double = js.native
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 1 */ val File: File with scala.Double = js.native
  /* 16 */ val HighPriority: HighPriority with scala.Double = js.native
  /* 8 */ val IsJob: IsJob with scala.Double = js.native
  /* 64 */ val LowPriority: LowPriority with scala.Double = js.native
  /* 2 */ val Parts: Parts with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EDRMBlobDownloadType with scala.Double] = js.native
}

