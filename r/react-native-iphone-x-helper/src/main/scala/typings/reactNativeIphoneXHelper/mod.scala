package typings.reactNativeIphoneXHelper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-iphone-x-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBottomSpace(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomSpace")().asInstanceOf[Double]
  
  inline def getStatusBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")().asInstanceOf[Double]
  inline def getStatusBarHeight(safe: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")(safe.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ifIphoneX[T](iphoneXVal: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ifIphoneX")(iphoneXVal.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def ifIphoneX[T, U](iphoneXVal: T, regularVal: U): T | U = (^.asInstanceOf[js.Dynamic].applyDynamic("ifIphoneX")(iphoneXVal.asInstanceOf[js.Any], regularVal.asInstanceOf[js.Any])).asInstanceOf[T | U]
  
  inline def isIphoneX(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIphoneX")().asInstanceOf[Boolean]
}
