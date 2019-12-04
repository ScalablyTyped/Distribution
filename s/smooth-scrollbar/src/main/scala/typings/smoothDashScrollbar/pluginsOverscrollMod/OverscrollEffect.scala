package typings.smoothDashScrollbar.pluginsOverscrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverscrollEffect extends js.Object

@JSImport("smooth-scrollbar/plugins/overscroll", "OverscrollEffect")
@js.native
object OverscrollEffect extends js.Object {
  @js.native
  sealed trait BOUNCE extends OverscrollEffect
  
  @js.native
  sealed trait GLOW extends OverscrollEffect
  
  /* "bounce" */ val BOUNCE: typings.smoothDashScrollbar.pluginsOverscrollMod.OverscrollEffect.BOUNCE with String = js.native
  /* "glow" */ val GLOW: typings.smoothDashScrollbar.pluginsOverscrollMod.OverscrollEffect.GLOW with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverscrollEffect with String] = js.native
}

