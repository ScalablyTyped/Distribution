package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVideoFormat extends StObject
@JSImport("steam-user", "EVideoFormat")
@js.native
object EVideoFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EVideoFormat & Double] = js.native
  
  @js.native
  sealed trait Accel
    extends StObject
       with EVideoFormat
  /* 2 */ val Accel: typings.steamUser.mod.EVideoFormat.Accel & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EVideoFormat
  /* 0 */ val None: typings.steamUser.mod.EVideoFormat.None & Double = js.native
  
  @js.native
  sealed trait YV12
    extends StObject
       with EVideoFormat
  /* 1 */ val YV12: typings.steamUser.mod.EVideoFormat.YV12 & Double = js.native
}
