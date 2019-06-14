package typings
package steamLib.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatEntryType extends js.Object

@JSImport("steam", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  @js.native
  sealed trait ChatMsg
    extends steamLib.steamMod.EChatEntryType
  
  /* 0 */ val ChatMsg: ChatMsg with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamLib.steamMod.EChatEntryType with scala.Double] = js.native
}

