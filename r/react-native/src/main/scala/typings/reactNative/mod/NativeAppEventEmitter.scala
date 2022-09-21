package typings.reactNative.mod

import typings.reactNative.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native", "NativeAppEventEmitter")
@js.native
open class NativeAppEventEmitter ()
  extends StObject
     with DeviceEventEmitterStatic
object NativeAppEventEmitter {
  
  inline def apply: RCTNativeAppEventEmitter = ^.asInstanceOf[js.Dynamic].selectDynamic("NativeAppEventEmitter").asInstanceOf[RCTNativeAppEventEmitter]
}
