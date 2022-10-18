package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoPlayStrategy extends StObject
@JSImport("react-alice-carousel/lib/types", "AutoPlayStrategy")
@js.native
object AutoPlayStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoPlayStrategy & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with AutoPlayStrategy
  /* "action" */ val ACTION: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.ACTION & String = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with AutoPlayStrategy
  /* "all" */ val ALL: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.ALL & String = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with AutoPlayStrategy
  /* "default" */ val DEFAULT: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.DEFAULT & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with AutoPlayStrategy
  /* "none" */ val NONE: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.NONE & String = js.native
}
