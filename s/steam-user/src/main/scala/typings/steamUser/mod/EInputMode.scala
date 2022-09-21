package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EInputMode extends StObject
@JSImport("steam-user", "EInputMode")
@js.native
object EInputMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EInputMode & Double] = js.native
  
  @js.native
  sealed trait Controller
    extends StObject
       with EInputMode
  /* 2 */ val Controller: typings.steamUser.mod.EInputMode.Controller & Double = js.native
  
  @js.native
  sealed trait Mouse
    extends StObject
       with EInputMode
  /* 1 */ val Mouse: typings.steamUser.mod.EInputMode.Mouse & Double = js.native
  
  @js.native
  sealed trait MouseAndController
    extends StObject
       with EInputMode
  /* 3 */ val MouseAndController: typings.steamUser.mod.EInputMode.MouseAndController & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EInputMode
  /* 0 */ val Unknown: typings.steamUser.mod.EInputMode.Unknown & Double = js.native
}
