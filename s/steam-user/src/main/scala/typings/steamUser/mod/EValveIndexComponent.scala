package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EValveIndexComponent extends StObject
@JSImport("steam-user", "EValveIndexComponent")
@js.native
object EValveIndexComponent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EValveIndexComponent & Double] = js.native
  
  @js.native
  sealed trait HMD
    extends StObject
       with EValveIndexComponent
  /* 1 */ val HMD: typings.steamUser.mod.EValveIndexComponent.HMD & Double = js.native
  
  @js.native
  sealed trait LeftKnuckle
    extends StObject
       with EValveIndexComponent
  /* 2 */ val LeftKnuckle: typings.steamUser.mod.EValveIndexComponent.LeftKnuckle & Double = js.native
  
  @js.native
  sealed trait RightKnuckle
    extends StObject
       with EValveIndexComponent
  /* 3 */ val RightKnuckle: typings.steamUser.mod.EValveIndexComponent.RightKnuckle & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EValveIndexComponent
  /* 0 */ val Unknown: typings.steamUser.mod.EValveIndexComponent.Unknown & Double = js.native
}
