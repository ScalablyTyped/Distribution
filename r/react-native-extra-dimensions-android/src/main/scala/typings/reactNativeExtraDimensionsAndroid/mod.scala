package typings.reactNativeExtraDimensionsAndroid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-extra-dimensions-android", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(dimension: Dimensions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(dimension.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRealWindowHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRealWindowHeight")().asInstanceOf[Double]
  
  inline def getRealWindowWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRealWindowWidth")().asInstanceOf[Double]
  
  inline def getSmartBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSmartBarHeight")().asInstanceOf[Double]
  
  inline def getSoftMenuBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSoftMenuBarHeight")().asInstanceOf[Double]
  
  inline def getStatusBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")().asInstanceOf[Double]
  
  inline def isSoftMenuBarEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSoftMenuBarEnabled")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_HEIGHT
    - typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_WIDTH
    - typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.STATUS_BAR_HEIGHT
    - typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SOFT_MENU_BAR_HEIGHT
    - typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SMART_BAR_HEIGHT
  */
  trait Dimensions extends StObject
  object Dimensions {
    
    inline def REAL_WINDOW_HEIGHT: typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_HEIGHT = "REAL_WINDOW_HEIGHT".asInstanceOf[typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_HEIGHT]
    
    inline def REAL_WINDOW_WIDTH: typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_WIDTH = "REAL_WINDOW_WIDTH".asInstanceOf[typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.REAL_WINDOW_WIDTH]
    
    inline def SMART_BAR_HEIGHT: typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SMART_BAR_HEIGHT = "SMART_BAR_HEIGHT".asInstanceOf[typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SMART_BAR_HEIGHT]
    
    inline def SOFT_MENU_BAR_HEIGHT: typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SOFT_MENU_BAR_HEIGHT = "SOFT_MENU_BAR_HEIGHT".asInstanceOf[typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.SOFT_MENU_BAR_HEIGHT]
    
    inline def STATUS_BAR_HEIGHT: typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.STATUS_BAR_HEIGHT = "STATUS_BAR_HEIGHT".asInstanceOf[typings.reactNativeExtraDimensionsAndroid.reactNativeExtraDimensionsAndroidStrings.STATUS_BAR_HEIGHT]
  }
}
