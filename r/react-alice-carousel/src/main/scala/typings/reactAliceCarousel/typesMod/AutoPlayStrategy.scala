package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoPlayStrategy extends StObject
@JSImport("react-alice-carousel/lib/types", "AutoPlayStrategy")
@js.native
object AutoPlayStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoPlayStrategy with String] = js.native
  
  @js.native
  sealed trait ACTION extends AutoPlayStrategy
  /* "action" */ val ACTION: typings.reactAliceCarousel.typesMod.AutoPlayStrategy.ACTION with String = js.native
  
  @js.native
  sealed trait ALL extends AutoPlayStrategy
  /* "all" */ val ALL: typings.reactAliceCarousel.typesMod.AutoPlayStrategy.ALL with String = js.native
  
  @js.native
  sealed trait DEFAULT extends AutoPlayStrategy
  /* "default" */ val DEFAULT: typings.reactAliceCarousel.typesMod.AutoPlayStrategy.DEFAULT with String = js.native
  
  @js.native
  sealed trait NONE extends AutoPlayStrategy
  /* "none" */ val NONE: typings.reactAliceCarousel.typesMod.AutoPlayStrategy.NONE with String = js.native
}
