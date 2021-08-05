package typings.shevyjs

import typings.shevyjs.mod.default
import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import typings.shevyjs.typesMod.Factor
import typings.shevyjs.typesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("shevyjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcHeadingFontSize(thisArg: default, factor: Factor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHeadingFontSize")(thisArg.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def calcHeadingLineHeight(thisArg: default, factor: Factor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHeadingLineHeight")(thisArg.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calcHeadingMarginBottom(thisArg: default, factor: Factor): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHeadingMarginBottom")(thisArg.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def calcHeadingMarginBottom(thisArg: default, factor: Factor, addMarginBottom: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHeadingMarginBottom")(thisArg.asInstanceOf[js.Any], factor.asInstanceOf[js.Any], addMarginBottom.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getFontScale(fontScale: majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontScale")(fontScale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getFontScale(fontScale: Scale): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontScale")(fontScale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getFontUnit(size: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontUnit")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFontValue(size: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontValue")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def trimArrayToMaxOf6[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimArrayToMaxOf6")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
