package typings.reactNativeOrientation

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-orientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOrientationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSpecificOrientationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getInitialOrientation(): orientation = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialOrientation")().asInstanceOf[orientation]
  
  @scala.inline
  def getOrientation(callback: js.Function2[/* err */ Error, /* orientation */ orientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getSpecificOrientation(callback: js.Function2[/* err */ Error, /* orientation */ specificOrientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecificOrientation")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def lockToLandscape(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockToLandscape")().asInstanceOf[Unit]
  
  @scala.inline
  def lockToLandscapeLeft(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockToLandscapeLeft")().asInstanceOf[Unit]
  
  @scala.inline
  def lockToLandscapeRight(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockToLandscapeRight")().asInstanceOf[Unit]
  
  @scala.inline
  def lockToPortrait(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockToPortrait")().asInstanceOf[Unit]
  
  @scala.inline
  def removeOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOrientationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecificOrientationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unlockAllOrientations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlockAllOrientations")().asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE
    - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT
    - typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN
    - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN
  */
  trait orientation extends StObject
  object orientation {
    
    @scala.inline
    def LANDSCAPE: typings.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE = "LANDSCAPE".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE]
    
    @scala.inline
    def PORTRAIT: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT = "PORTRAIT".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT]
    
    @scala.inline
    def PORTRAITUPSIDEDOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN]
    
    @scala.inline
    def UNKNOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT`
    - typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT`
    - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT
    - typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN
    - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN
  */
  trait specificOrientation extends StObject
  object specificOrientation {
    
    @scala.inline
    def `LANDSCAPE-LEFT`: typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT` = "LANDSCAPE-LEFT".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT`]
    
    @scala.inline
    def `LANDSCAPE-RIGHT`: typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT` = "LANDSCAPE-RIGHT".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT`]
    
    @scala.inline
    def PORTRAIT: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT = "PORTRAIT".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT]
    
    @scala.inline
    def PORTRAITUPSIDEDOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN]
    
    @scala.inline
    def UNKNOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN]
  }
}
