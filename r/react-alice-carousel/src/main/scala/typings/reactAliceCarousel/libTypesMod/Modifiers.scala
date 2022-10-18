package typings.reactAliceCarousel.libTypesMod

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
  /* "__active" */ val ACTIVE: typings.reactAliceCarousel.libTypesMod.Modifiers.ACTIVE & String = js.native
  
  @js.native
  sealed trait CLONED
    extends StObject
       with Modifiers
  /* "__cloned" */ val CLONED: typings.reactAliceCarousel.libTypesMod.Modifiers.CLONED & String = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with Modifiers
  /* "__custom" */ val CUSTOM: typings.reactAliceCarousel.libTypesMod.Modifiers.CUSTOM & String = js.native
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with Modifiers
  /* "__inactive" */ val INACTIVE: typings.reactAliceCarousel.libTypesMod.Modifiers.INACTIVE & String = js.native
  
  @js.native
  sealed trait PAUSE
    extends StObject
       with Modifiers
  /* "__pause" */ val PAUSE: typings.reactAliceCarousel.libTypesMod.Modifiers.PAUSE & String = js.native
  
  @js.native
  sealed trait SEPARATOR
    extends StObject
       with Modifiers
  /* "__separator" */ val SEPARATOR: typings.reactAliceCarousel.libTypesMod.Modifiers.SEPARATOR & String = js.native
  
  @js.native
  sealed trait SSR
    extends StObject
       with Modifiers
  /* "__ssr" */ val SSR: typings.reactAliceCarousel.libTypesMod.Modifiers.SSR & String = js.native
  
  @js.native
  sealed trait TARGET
    extends StObject
       with Modifiers
  /* "__target" */ val TARGET: typings.reactAliceCarousel.libTypesMod.Modifiers.TARGET & String = js.native
}
