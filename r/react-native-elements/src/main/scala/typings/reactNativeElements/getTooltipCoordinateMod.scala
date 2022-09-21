package typings.reactNativeElements

import typings.reactNativeElements.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTooltipCoordinateMod {
  
  @JSImport("react-native-elements/dist/tooltip/getTooltipCoordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    ScreenWidth: Double,
    ScreenHeight: Double,
    tooltipWidth: Double,
    tooltipHeight: Double,
    withPointer: Boolean
  ): X = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ScreenWidth.asInstanceOf[js.Any], ScreenHeight.asInstanceOf[js.Any], tooltipWidth.asInstanceOf[js.Any], tooltipHeight.asInstanceOf[js.Any], withPointer.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getElementVisibleWidth(elementWidth: Double, xOffset: Double, ScreenWidth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementVisibleWidth")(elementWidth.asInstanceOf[js.Any], xOffset.asInstanceOf[js.Any], ScreenWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
}
