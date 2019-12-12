package typings.steam.steamMod

import org.scalablytyped.runtime.TopLevel
import typings.steam.steamMod.EChatEntryType.ChatMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatEntryType extends js.Object

@JSImport("steam", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  @js.native
  sealed trait ChatMsg extends EChatEntryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
  /* 0 */ @js.native
  object ChatMsg extends TopLevel[ChatMsg with Double]
  
}

