package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileVisibility extends StObject
@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with EPublishedFileVisibility
  /* 1 */ val FriendsOnly: typings.steamClient.mod.EPublishedFileVisibility.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EPublishedFileVisibility
  /* 2 */ val Private: typings.steamClient.mod.EPublishedFileVisibility.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EPublishedFileVisibility
  /* 0 */ val Public: typings.steamClient.mod.EPublishedFileVisibility.Public & Double = js.native
}
