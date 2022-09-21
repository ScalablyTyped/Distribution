package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamActivity extends StObject
@JSImport("steam-user", "EStreamActivity")
@js.native
object EStreamActivity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamActivity & Double] = js.native
  
  @js.native
  sealed trait Desktop
    extends StObject
       with EStreamActivity
  /* 3 */ val Desktop: typings.steamUser.mod.EStreamActivity.Desktop & Double = js.native
  
  @js.native
  sealed trait Game
    extends StObject
       with EStreamActivity
  /* 2 */ val Game: typings.steamUser.mod.EStreamActivity.Game & Double = js.native
  
  @js.native
  sealed trait Idle
    extends StObject
       with EStreamActivity
  /* 1 */ val Idle: typings.steamUser.mod.EStreamActivity.Idle & Double = js.native
  
  @js.native
  sealed trait SecureDesktop
    extends StObject
       with EStreamActivity
  /* 4 */ val SecureDesktop: typings.steamUser.mod.EStreamActivity.SecureDesktop & Double = js.native
}
