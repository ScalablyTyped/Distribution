package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSImport("react-alice-carousel/lib/types", "EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with EventType
  /* "action" */ val ACTION: typings.reactAliceCarousel.libTypesMod.EventType.ACTION & String = js.native
  
  @js.native
  sealed trait INIT
    extends StObject
       with EventType
  /* "init" */ val INIT: typings.reactAliceCarousel.libTypesMod.EventType.INIT & String = js.native
  
  @js.native
  sealed trait RESIZE
    extends StObject
       with EventType
  /* "resize" */ val RESIZE: typings.reactAliceCarousel.libTypesMod.EventType.RESIZE & String = js.native
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with EventType
  /* "update" */ val UPDATE: typings.reactAliceCarousel.libTypesMod.EventType.UPDATE & String = js.native
}
