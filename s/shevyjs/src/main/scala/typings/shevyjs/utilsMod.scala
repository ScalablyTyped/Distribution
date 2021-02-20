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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("shevyjs/utils", "calcHeadingFontSize")
  @js.native
  def calcHeadingFontSize(thisArg: default, factor: Factor): String = js.native
  
  @JSImport("shevyjs/utils", "calcHeadingLineHeight")
  @js.native
  def calcHeadingLineHeight(thisArg: default, factor: Factor): Double = js.native
  
  @JSImport("shevyjs/utils", "calcHeadingMarginBottom")
  @js.native
  def calcHeadingMarginBottom(thisArg: default, factor: Factor): js.UndefOr[String] = js.native
  @JSImport("shevyjs/utils", "calcHeadingMarginBottom")
  @js.native
  def calcHeadingMarginBottom(thisArg: default, factor: Factor, addMarginBottom: Boolean): js.UndefOr[String] = js.native
  
  @JSImport("shevyjs/utils", "getFontScale")
  @js.native
  def getFontScale(fontScale: majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): js.Array[Double] = js.native
  @JSImport("shevyjs/utils", "getFontScale")
  @js.native
  def getFontScale(fontScale: Scale): js.Array[Double] = js.native
  
  @JSImport("shevyjs/utils", "getFontUnit")
  @js.native
  def getFontUnit(size: String): String = js.native
  
  @JSImport("shevyjs/utils", "getFontValue")
  @js.native
  def getFontValue(size: String): Double = js.native
  
  @JSImport("shevyjs/utils", "trimArrayToMaxOf6")
  @js.native
  def trimArrayToMaxOf6[T](array: js.Array[T]): js.Array[T] = js.native
}
