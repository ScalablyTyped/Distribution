package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadType extends StObject
@JSImport("steam-client", "EDRMBlobDownloadType")
@js.native
object EDRMBlobDownloadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadType with Double] = js.native
  
  @js.native
  sealed trait AddTimestamp extends EDRMBlobDownloadType
  /* 32 */ val AddTimestamp: typings.steamClient.mod.EDRMBlobDownloadType.AddTimestamp with Double = js.native
  
  @js.native
  sealed trait AllMask extends EDRMBlobDownloadType
  /* 7 */ val AllMask: typings.steamClient.mod.EDRMBlobDownloadType.AllMask with Double = js.native
  
  @js.native
  sealed trait Compressed extends EDRMBlobDownloadType
  /* 4 */ val Compressed: typings.steamClient.mod.EDRMBlobDownloadType.Compressed with Double = js.native
  
  @js.native
  sealed trait Error extends EDRMBlobDownloadType
  /* 0 */ val Error: typings.steamClient.mod.EDRMBlobDownloadType.Error with Double = js.native
  
  @js.native
  sealed trait File extends EDRMBlobDownloadType
  /* 1 */ val File: typings.steamClient.mod.EDRMBlobDownloadType.File with Double = js.native
  
  @js.native
  sealed trait HighPriority extends EDRMBlobDownloadType
  /* 16 */ val HighPriority: typings.steamClient.mod.EDRMBlobDownloadType.HighPriority with Double = js.native
  
  @js.native
  sealed trait IsJob extends EDRMBlobDownloadType
  /* 8 */ val IsJob: typings.steamClient.mod.EDRMBlobDownloadType.IsJob with Double = js.native
  
  @js.native
  sealed trait LowPriority extends EDRMBlobDownloadType
  /* 64 */ val LowPriority: typings.steamClient.mod.EDRMBlobDownloadType.LowPriority with Double = js.native
  
  @js.native
  sealed trait Parts extends EDRMBlobDownloadType
  /* 2 */ val Parts: typings.steamClient.mod.EDRMBlobDownloadType.Parts with Double = js.native
}
