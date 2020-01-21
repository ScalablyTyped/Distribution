package typings.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Levels")
@js.native
object Levels extends js.Object {
  /* 3 */ val debug: typings.sipJs.levelsMod.Levels.debug with Double = js.native
  /* 0 */ val error: typings.sipJs.levelsMod.Levels.error with Double = js.native
  /* 2 */ val log: typings.sipJs.levelsMod.Levels.log with Double = js.native
  /* 1 */ val warn: typings.sipJs.levelsMod.Levels.warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sipJs.levelsMod.Levels with Double] = js.native
}

