package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamDataMessage extends StObject
@JSImport("steam-user", "EStreamDataMessage")
@js.native
object EStreamDataMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamDataMessage & Double] = js.native
  
  @js.native
  sealed trait DataLost
    extends StObject
       with EStreamDataMessage
  /* 2 */ val DataLost: typings.steamUser.mod.EStreamDataMessage.DataLost & Double = js.native
  
  @js.native
  sealed trait DataPacket
    extends StObject
       with EStreamDataMessage
  /* 1 */ val DataPacket: typings.steamUser.mod.EStreamDataMessage.DataPacket & Double = js.native
}
