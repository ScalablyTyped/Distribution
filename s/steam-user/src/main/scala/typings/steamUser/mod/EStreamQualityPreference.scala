package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamQualityPreference extends StObject
@JSImport("steam-user", "EStreamQualityPreference")
@js.native
object EStreamQualityPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamQualityPreference & Double] = js.native
  
  @js.native
  sealed trait Balanced
    extends StObject
       with EStreamQualityPreference
  /* 2 */ val Balanced: typings.steamUser.mod.EStreamQualityPreference.Balanced & Double = js.native
  
  @js.native
  sealed trait Beautiful
    extends StObject
       with EStreamQualityPreference
  /* 3 */ val Beautiful: typings.steamUser.mod.EStreamQualityPreference.Beautiful & Double = js.native
  
  @js.native
  sealed trait Fast
    extends StObject
       with EStreamQualityPreference
  /* 1 */ val Fast: typings.steamUser.mod.EStreamQualityPreference.Fast & Double = js.native
}
