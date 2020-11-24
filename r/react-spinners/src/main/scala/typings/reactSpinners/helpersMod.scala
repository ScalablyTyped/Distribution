package typings.reactSpinners

import typings.reactSpinners.anon.RequiredLoaderHeightWidth
import typings.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typings.reactSpinners.anon.RequiredLoaderSizeMarginP
import typings.reactSpinners.anon.RequiredLoaderSizeProps
import typings.reactSpinners.colorsMod.RgbaFunction
import typings.reactSpinners.interfacesMod.LengthObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  val calculateRgba: RgbaFunction = js.native
  
  def cssValue(value: String): String = js.native
  def cssValue(value: Double): String = js.native
  
  def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = js.native
  
  def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = js.native
  def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = js.native
  
  def parseLengthAndUnit(size: String): LengthObject = js.native
  def parseLengthAndUnit(size: Double): LengthObject = js.native
  
  def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = js.native
  
  def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = js.native
}
