package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlsStrategy extends StObject
@JSImport("react-alice-carousel/lib/types", "ControlsStrategy")
@js.native
object ControlsStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ControlsStrategy & String] = js.native
  
  @js.native
  sealed trait ALTERNATE
    extends StObject
       with ControlsStrategy
  /* "alternate" */ val ALTERNATE: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.ALTERNATE & String = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ControlsStrategy
  /* "default" */ val DEFAULT: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.DEFAULT & String = js.native
  
  @js.native
  sealed trait RESPONSIVE
    extends StObject
       with ControlsStrategy
  /* "responsive" */ val RESPONSIVE: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.RESPONSIVE & String = js.native
}
