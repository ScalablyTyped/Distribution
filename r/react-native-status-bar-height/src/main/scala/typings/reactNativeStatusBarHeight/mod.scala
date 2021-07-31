package typings.reactNativeStatusBarHeight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-status-bar-height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStatusBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")().asInstanceOf[Double]
  @scala.inline
  def getStatusBarHeight(skipAndroid: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")(skipAndroid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isExpo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpo")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhone12(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone12")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhone12Max(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone12Max")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhoneWithMonobrow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneWithMonobrow")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhoneX(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneX")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhoneXMax(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneXMax")().asInstanceOf[Boolean]
}
