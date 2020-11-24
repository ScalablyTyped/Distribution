package typings.reactSpinners

import typings.reactSpinners.anon.RequiredLoaderHeightWidth
import typings.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typings.reactSpinners.anon.RequiredLoaderSizeMarginP
import typings.reactSpinners.anon.RequiredLoaderSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/helpers/proptypes", JSImport.Namespace)
@js.native
object proptypesMod extends js.Object {
  
  def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = js.native
  
  def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = js.native
  def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = js.native
  
  def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = js.native
  
  def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = js.native
}
