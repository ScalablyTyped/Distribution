package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationType extends js.Object
@JSImport("react-alice-carousel/lib/types", "AnimationType")
@js.native
object AnimationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnimationType with String] = js.native
  
  @js.native
  sealed trait FADEOUT extends AnimationType
  /* "fadeout" */ @js.native
  object FADEOUT extends TopLevel[FADEOUT with String]
  
  @js.native
  sealed trait SLIDE extends AnimationType
  /* "slide" */ @js.native
  object SLIDE extends TopLevel[SLIDE with String]
}
