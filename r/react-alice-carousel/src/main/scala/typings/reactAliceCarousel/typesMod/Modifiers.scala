package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Modifiers extends StObject
@JSImport("react-alice-carousel/lib/types", "Modifiers")
@js.native
object Modifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Modifiers & String] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with Modifiers
  /* "__active" */ val ACTIVE: typings.reactAliceCarousel.typesMod.Modifiers.ACTIVE & String = js.native
  
  @js.native
  sealed trait CLONED
    extends StObject
       with Modifiers
  /* "__cloned" */ val CLONED: typings.reactAliceCarousel.typesMod.Modifiers.CLONED & String = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with Modifiers
  /* "__custom" */ val CUSTOM: typings.reactAliceCarousel.typesMod.Modifiers.CUSTOM & String = js.native
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with Modifiers
  /* "__inactive" */ val INACTIVE: typings.reactAliceCarousel.typesMod.Modifiers.INACTIVE & String = js.native
  
  @js.native
  sealed trait PAUSE
    extends StObject
       with Modifiers
  /* "__pause" */ val PAUSE: typings.reactAliceCarousel.typesMod.Modifiers.PAUSE & String = js.native
  
  @js.native
  sealed trait SEPARATOR
    extends StObject
       with Modifiers
  /* "__separator" */ val SEPARATOR: typings.reactAliceCarousel.typesMod.Modifiers.SEPARATOR & String = js.native
  
  @js.native
  sealed trait SSR
    extends StObject
       with Modifiers
  /* "__ssr" */ val SSR: typings.reactAliceCarousel.typesMod.Modifiers.SSR & String = js.native
  
  @js.native
  sealed trait TARGET
    extends StObject
       with Modifiers
  /* "__target" */ val TARGET: typings.reactAliceCarousel.typesMod.Modifiers.TARGET & String = js.native
}
