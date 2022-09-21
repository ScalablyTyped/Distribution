package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamBitrate extends StObject
@JSImport("steam-user", "EStreamBitrate")
@js.native
object EStreamBitrate extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamBitrate & Double] = js.native
  
  @js.native
  sealed trait Autodetect
    extends StObject
       with EStreamBitrate
  /* -1 */ val Autodetect: typings.steamUser.mod.EStreamBitrate.Autodetect & Double = js.native
  
  @js.native
  sealed trait Unlimited
    extends StObject
       with EStreamBitrate
  /* 0 */ val Unlimited: typings.steamUser.mod.EStreamBitrate.Unlimited & Double = js.native
}
