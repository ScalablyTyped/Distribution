package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientUIMode extends StObject
@JSImport("steam-user", "EClientUIMode")
@js.native
object EClientUIMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientUIMode & Double] = js.native
  
  @js.native
  sealed trait BigPicture
    extends StObject
       with EClientUIMode
  /* 1 */ val BigPicture: typings.steamUser.mod.EClientUIMode.BigPicture & Double = js.native
  
  @js.native
  sealed trait Mobile
    extends StObject
       with EClientUIMode
  /* 2 */ val Mobile: typings.steamUser.mod.EClientUIMode.Mobile & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EClientUIMode
  /* 0 */ val None: typings.steamUser.mod.EClientUIMode.None & Double = js.native
  
  @js.native
  sealed trait Web
    extends StObject
       with EClientUIMode
  /* 3 */ val Web: typings.steamUser.mod.EClientUIMode.Web & Double = js.native
}
