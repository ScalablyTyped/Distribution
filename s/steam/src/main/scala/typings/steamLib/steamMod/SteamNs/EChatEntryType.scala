package typings
package steamLib.steamMod.SteamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatEntryType extends js.Object

@JSImport("steam/Steam", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  @js.native
  sealed trait ChatMsg
    extends steamLib.steamMod.SteamNs.EChatEntryType
  
}

