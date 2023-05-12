package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.Position
import typings.reactAliceCarousel.libTypesMod.ItemCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMappersMod {
  
  @JSImport("react-alice-carousel/lib/utils/mappers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapPartialCoords(coords: js.Array[ItemCoords]): js.Array[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPartialCoords")(coords.asInstanceOf[js.Any]).asInstanceOf[js.Array[Position]]
  
  inline def mapPositionCoords(coords: js.Array[ItemCoords]): js.Array[ItemCoords] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPositionCoords")(coords.asInstanceOf[js.Any]).asInstanceOf[js.Array[ItemCoords]]
  inline def mapPositionCoords(coords: js.Array[ItemCoords], position: Double): js.Array[ItemCoords] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPositionCoords")(coords.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[ItemCoords]]
}
