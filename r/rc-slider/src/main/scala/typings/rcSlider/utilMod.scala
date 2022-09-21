package typings.rcSlider

import typings.rcSlider.interfaceMod.Direction
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-slider/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectionStyle(direction: Direction, value: Double, min: Double, max: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionStyle")(direction.asInstanceOf[js.Any], value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def getIndex[T](value: T, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getIndex[T](value: js.Array[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getOffset(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
