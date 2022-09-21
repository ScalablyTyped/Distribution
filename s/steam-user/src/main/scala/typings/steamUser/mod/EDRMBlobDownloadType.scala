package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadType extends StObject
@JSImport("steam-user", "EDRMBlobDownloadType")
@js.native
object EDRMBlobDownloadType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadType & Double] = js.native
  
  @js.native
  sealed trait AddTimestamp
    extends StObject
       with EDRMBlobDownloadType
  /* 32 */ val AddTimestamp: typings.steamUser.mod.EDRMBlobDownloadType.AddTimestamp & Double = js.native
  
  @js.native
  sealed trait AllMask
    extends StObject
       with EDRMBlobDownloadType
  /* 7 */ val AllMask: typings.steamUser.mod.EDRMBlobDownloadType.AllMask & Double = js.native
  
  @js.native
  sealed trait Compressed
    extends StObject
       with EDRMBlobDownloadType
  /* 4 */ val Compressed: typings.steamUser.mod.EDRMBlobDownloadType.Compressed & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with EDRMBlobDownloadType
  /* 0 */ val Error: typings.steamUser.mod.EDRMBlobDownloadType.Error & Double = js.native
  
  @js.native
  sealed trait File
    extends StObject
       with EDRMBlobDownloadType
  /* 1 */ val File: typings.steamUser.mod.EDRMBlobDownloadType.File & Double = js.native
  
  @js.native
  sealed trait HighPriority
    extends StObject
       with EDRMBlobDownloadType
  /* 16 */ val HighPriority: typings.steamUser.mod.EDRMBlobDownloadType.HighPriority & Double = js.native
  
  @js.native
  sealed trait IsJob
    extends StObject
       with EDRMBlobDownloadType
  /* 8 */ val IsJob: typings.steamUser.mod.EDRMBlobDownloadType.IsJob & Double = js.native
  
  @js.native
  sealed trait LowPriority
    extends StObject
       with EDRMBlobDownloadType
  /* 64 */ val LowPriority: typings.steamUser.mod.EDRMBlobDownloadType.LowPriority & Double = js.native
  
  @js.native
  sealed trait Parts
    extends StObject
       with EDRMBlobDownloadType
  /* 2 */ val Parts: typings.steamUser.mod.EDRMBlobDownloadType.Parts & Double = js.native
}
