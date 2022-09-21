package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDeltaChunkDataLocation extends StObject
@JSImport("steam-user", "EContentDeltaChunkDataLocation")
@js.native
object EContentDeltaChunkDataLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDeltaChunkDataLocation & Double] = js.native
  
  @js.native
  sealed trait AfterProtobuf
    extends StObject
       with EContentDeltaChunkDataLocation
  /* 1 */ val AfterProtobuf: typings.steamUser.mod.EContentDeltaChunkDataLocation.AfterProtobuf & Double = js.native
  
  @js.native
  sealed trait InProtobuf
    extends StObject
       with EContentDeltaChunkDataLocation
  /* 0 */ val InProtobuf: typings.steamUser.mod.EContentDeltaChunkDataLocation.InProtobuf & Double = js.native
}
