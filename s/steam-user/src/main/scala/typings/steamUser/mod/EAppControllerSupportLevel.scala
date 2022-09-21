package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppControllerSupportLevel extends StObject
@JSImport("steam-user", "EAppControllerSupportLevel")
@js.native
object EAppControllerSupportLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppControllerSupportLevel & Double] = js.native
  
  @js.native
  sealed trait Full
    extends StObject
       with EAppControllerSupportLevel
  /* 2 */ val Full: typings.steamUser.mod.EAppControllerSupportLevel.Full & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EAppControllerSupportLevel
  /* 0 */ val None: typings.steamUser.mod.EAppControllerSupportLevel.None & Double = js.native
  
  @js.native
  sealed trait Partial
    extends StObject
       with EAppControllerSupportLevel
  /* 1 */ val Partial: typings.steamUser.mod.EAppControllerSupportLevel.Partial & Double = js.native
}
