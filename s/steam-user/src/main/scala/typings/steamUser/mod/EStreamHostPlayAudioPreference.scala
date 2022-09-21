package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamHostPlayAudioPreference extends StObject
@JSImport("steam-user", "EStreamHostPlayAudioPreference")
@js.native
object EStreamHostPlayAudioPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamHostPlayAudioPreference & Double] = js.native
  
  @js.native
  sealed trait k_EStreamHostPlayAudioAlways
    extends StObject
       with EStreamHostPlayAudioPreference
  /* 1 */ val k_EStreamHostPlayAudioAlways: typings.steamUser.mod.EStreamHostPlayAudioPreference.k_EStreamHostPlayAudioAlways & Double = js.native
  
  @js.native
  sealed trait k_EStreamHostPlayAudioDefault
    extends StObject
       with EStreamHostPlayAudioPreference
  /* 0 */ val k_EStreamHostPlayAudioDefault: typings.steamUser.mod.EStreamHostPlayAudioPreference.k_EStreamHostPlayAudioDefault & Double = js.native
}
