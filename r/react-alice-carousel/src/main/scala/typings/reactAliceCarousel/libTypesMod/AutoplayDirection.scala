package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoplayDirection extends StObject
@JSImport("react-alice-carousel/lib/types", "AutoplayDirection")
@js.native
object AutoplayDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoplayDirection & String] = js.native
  
  @js.native
  sealed trait LTR
    extends StObject
       with AutoplayDirection
  /* "ltr" */ val LTR: typings.reactAliceCarousel.libTypesMod.AutoplayDirection.LTR & String = js.native
  
  @js.native
  sealed trait RTL
    extends StObject
       with AutoplayDirection
  /* "rtl" */ val RTL: typings.reactAliceCarousel.libTypesMod.AutoplayDirection.RTL & String = js.native
}
