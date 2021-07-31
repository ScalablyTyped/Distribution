package typings.reactSpinners

import typings.reactSpinners.anon.RequiredLoaderHeightWidth
import typings.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typings.reactSpinners.anon.RequiredLoaderSizeMarginP
import typings.reactSpinners.anon.RequiredLoaderSizeProps
import typings.reactSpinners.colorsMod.RgbaFunction
import typings.reactSpinners.interfacesMod.LengthObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-spinners/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-spinners/helpers", "calculateRgba")
  @js.native
  val calculateRgba: RgbaFunction = js.native
  
  @scala.inline
  def cssValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def cssValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidth]
  
  @scala.inline
  def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthRadiusDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidthColor]
  @scala.inline
  def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthRadiusDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidthColor]
  
  @scala.inline
  def parseLengthAndUnit(size: String): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
  @scala.inline
  def parseLengthAndUnit(size: Double): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
  
  @scala.inline
  def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeDefaults")(sizeValue.asInstanceOf[js.Any]).asInstanceOf[RequiredLoaderSizeProps]
  
  @scala.inline
  def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeMarginDefaults")(sizeValue.asInstanceOf[js.Any]).asInstanceOf[RequiredLoaderSizeMarginP]
}
