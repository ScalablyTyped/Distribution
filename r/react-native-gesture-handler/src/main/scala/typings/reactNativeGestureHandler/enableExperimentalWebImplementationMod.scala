package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableExperimentalWebImplementationMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/EnableExperimentalWebImplementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableExperimentalWebImplementation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExperimentalWebImplementation")().asInstanceOf[Unit]
  inline def enableExperimentalWebImplementation(shouldEnable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExperimentalWebImplementation")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isExperimentalWebImplementationEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExperimentalWebImplementationEnabled")().asInstanceOf[Boolean]
}
