package typings
package steamLib.steamMod.SteamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam/Steam", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccountLogonDenied
    extends steamLib.steamMod.SteamNs.EResult
  
}

