package typings.reactSpinners

import typings.reactSpinners.anon.RequiredLoaderHeightWidth
import typings.reactSpinners.anon.RequiredLoaderHeightWidthColor
import typings.reactSpinners.anon.RequiredLoaderSizeMarginP
import typings.reactSpinners.anon.RequiredLoaderSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proptypesMod {
  
  @JSImport("react-spinners/helpers/proptypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def heightWidthDefaults(height: Double, width: Double): RequiredLoaderHeightWidth = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidth]
  
  inline def heightWidthRadiusDefaults(height: Double, width: Double): RequiredLoaderHeightWidthColor = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthRadiusDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidthColor]
  inline def heightWidthRadiusDefaults(height: Double, width: Double, radius: Double): RequiredLoaderHeightWidthColor = (^.asInstanceOf[js.Dynamic].applyDynamic("heightWidthRadiusDefaults")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[RequiredLoaderHeightWidthColor]
  
  inline def sizeDefaults(sizeValue: Double): RequiredLoaderSizeProps = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeDefaults")(sizeValue.asInstanceOf[js.Any]).asInstanceOf[RequiredLoaderSizeProps]
  
  inline def sizeMarginDefaults(sizeValue: Double): RequiredLoaderSizeMarginP = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeMarginDefaults")(sizeValue.asInstanceOf[js.Any]).asInstanceOf[RequiredLoaderSizeMarginP]
}
