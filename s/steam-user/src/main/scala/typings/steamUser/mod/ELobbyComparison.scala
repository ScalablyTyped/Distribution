package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELobbyComparison extends StObject
@JSImport("steam-user", "ELobbyComparison")
@js.native
object ELobbyComparison extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELobbyComparison & Double] = js.native
  
  @js.native
  sealed trait Equal
    extends StObject
       with ELobbyComparison
  /* 0 */ val Equal: typings.steamUser.mod.ELobbyComparison.Equal & Double = js.native
  
  @js.native
  sealed trait EqualToOrGreaterThan
    extends StObject
       with ELobbyComparison
  /* 2 */ val EqualToOrGreaterThan: typings.steamUser.mod.ELobbyComparison.EqualToOrGreaterThan & Double = js.native
  
  @js.native
  sealed trait EqualToOrLessThan
    extends StObject
       with ELobbyComparison
  /* -2 */ val EqualToOrLessThan: typings.steamUser.mod.ELobbyComparison.EqualToOrLessThan & Double = js.native
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with ELobbyComparison
  /* 1 */ val GreaterThan: typings.steamUser.mod.ELobbyComparison.GreaterThan & Double = js.native
  
  @js.native
  sealed trait LessThan
    extends StObject
       with ELobbyComparison
  /* -1 */ val LessThan: typings.steamUser.mod.ELobbyComparison.LessThan & Double = js.native
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with ELobbyComparison
  /* 3 */ val NotEqual: typings.steamUser.mod.ELobbyComparison.NotEqual & Double = js.native
}
