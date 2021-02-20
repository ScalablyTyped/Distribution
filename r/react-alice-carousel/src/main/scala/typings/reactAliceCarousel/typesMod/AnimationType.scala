package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationType extends StObject
@JSImport("react-alice-carousel/lib/types", "AnimationType")
@js.native
object AnimationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnimationType with String] = js.native
  
  @js.native
  sealed trait FADEOUT extends AnimationType
  /* "fadeout" */ val FADEOUT: typings.reactAliceCarousel.typesMod.AnimationType.FADEOUT with String = js.native
  
  @js.native
  sealed trait SLIDE extends AnimationType
  /* "slide" */ val SLIDE: typings.reactAliceCarousel.typesMod.AnimationType.SLIDE with String = js.native
}
