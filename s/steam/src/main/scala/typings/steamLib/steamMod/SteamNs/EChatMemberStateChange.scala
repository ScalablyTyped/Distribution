package typings
package steamLib.steamMod.SteamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam/Steam", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Kicked
    extends steamLib.steamMod.SteamNs.EChatMemberStateChange
  
}

