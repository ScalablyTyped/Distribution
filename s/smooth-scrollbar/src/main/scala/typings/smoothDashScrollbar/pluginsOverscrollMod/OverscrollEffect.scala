package typings.smoothDashScrollbar.pluginsOverscrollMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverscrollEffect with String] = js.native
  /* "bounce" */ @js.native
  object BOUNCE extends TopLevel[BOUNCE with String]
  
  /* "glow" */ @js.native
  object GLOW extends TopLevel[GLOW with String]
  
}

