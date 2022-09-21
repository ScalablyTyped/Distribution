package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamMouseWheelDirection extends StObject
@JSImport("steam-user", "EStreamMouseWheelDirection")
@js.native
object EStreamMouseWheelDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamMouseWheelDirection & Double] = js.native
  
  @js.native
  sealed trait Down
    extends StObject
       with EStreamMouseWheelDirection
  /* -120 */ val Down: typings.steamUser.mod.EStreamMouseWheelDirection.Down & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with EStreamMouseWheelDirection
  /* 3 */ val Left: typings.steamUser.mod.EStreamMouseWheelDirection.Left & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with EStreamMouseWheelDirection
  /* 4 */ val Right: typings.steamUser.mod.EStreamMouseWheelDirection.Right & Double = js.native
  
  @js.native
  sealed trait Up
    extends StObject
       with EStreamMouseWheelDirection
  /* 120 */ val Up: typings.steamUser.mod.EStreamMouseWheelDirection.Up & Double = js.native
}
