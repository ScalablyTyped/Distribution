package typings.reactNativeStatusBarHeight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-status-bar-height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStatusBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")().asInstanceOf[Double]
  inline def getStatusBarHeight(skipAndroid: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")(skipAndroid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isExpo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpo")().asInstanceOf[Boolean]
  
  inline def isIPhone12(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone12")().asInstanceOf[Boolean]
  
  inline def isIPhone12Max(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone12Max")().asInstanceOf[Boolean]
  
  inline def isIPhoneWithMonobrow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneWithMonobrow")().asInstanceOf[Boolean]
  
  inline def isIPhoneX(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneX")().asInstanceOf[Boolean]
  
  inline def isIPhoneXMax(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneXMax")().asInstanceOf[Boolean]
}
