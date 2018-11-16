package typings
package steamLib.steamMod.SteamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam/Steam", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Online
    extends steamLib.steamMod.SteamNs.EPersonaState
  
}

