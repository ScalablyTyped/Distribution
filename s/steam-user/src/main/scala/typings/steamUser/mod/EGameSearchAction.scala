package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EGameSearchAction extends StObject
@JSImport("steam-user", "EGameSearchAction")
@js.native
object EGameSearchAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EGameSearchAction & Double] = js.native
  
  @js.native
  sealed trait Accept
    extends StObject
       with EGameSearchAction
  /* 1 */ val Accept: typings.steamUser.mod.EGameSearchAction.Accept & Double = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with EGameSearchAction
  /* 3 */ val Cancel: typings.steamUser.mod.EGameSearchAction.Cancel & Double = js.native
  
  @js.native
  sealed trait Decline
    extends StObject
       with EGameSearchAction
  /* 2 */ val Decline: typings.steamUser.mod.EGameSearchAction.Decline & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EGameSearchAction
  /* 0 */ val None: typings.steamUser.mod.EGameSearchAction.None & Double = js.native
}
