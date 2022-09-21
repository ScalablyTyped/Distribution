package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileVisibility extends StObject
@JSImport("steam-user", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with EPublishedFileVisibility
  /* 1 */ val FriendsOnly: typings.steamUser.mod.EPublishedFileVisibility.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EPublishedFileVisibility
  /* 2 */ val Private: typings.steamUser.mod.EPublishedFileVisibility.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EPublishedFileVisibility
  /* 0 */ val Public: typings.steamUser.mod.EPublishedFileVisibility.Public & Double = js.native
}
