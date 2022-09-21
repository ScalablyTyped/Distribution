package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EKeyEscrowUsage extends StObject
@JSImport("steam-user", "EKeyEscrowUsage")
@js.native
object EKeyEscrowUsage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EKeyEscrowUsage & Double] = js.native
  
  @js.native
  sealed trait StreamingDevice
    extends StObject
       with EKeyEscrowUsage
  /* 0 */ val StreamingDevice: typings.steamUser.mod.EKeyEscrowUsage.StreamingDevice & Double = js.native
}
