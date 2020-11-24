package typings.smoothScrollbar.overscrollMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverscrollEffect extends js.Object
@JSImport("smooth-scrollbar/plugins/overscroll", "OverscrollEffect")
@js.native
object OverscrollEffect extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverscrollEffect with String] = js.native
  
  @js.native
  sealed trait BOUNCE extends OverscrollEffect
  /* "bounce" */ @js.native
  object BOUNCE extends TopLevel[BOUNCE with String]
  
  @js.native
  sealed trait GLOW extends OverscrollEffect
  /* "glow" */ @js.native
  object GLOW extends TopLevel[GLOW with String]
}
