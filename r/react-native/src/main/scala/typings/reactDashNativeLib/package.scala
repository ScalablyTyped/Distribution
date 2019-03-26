package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeLib {
  type AccessibilityChangeEvent = scala.Boolean
  type AccessibilityEvent = AccessibilityChangeEvent | AccessibilityAnnoucementFinishedEvent
  type BackgroundPropType = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RippleBackgroundPropType */ js.Any
  /* Rewritten from type alias, can be one of: 
    - Blob
    - stdLib.Int8Array
    - stdLib.Int16Array
    - stdLib.Int32Array
    - stdLib.Uint8Array
    - stdLib.Uint16Array
    - stdLib.Uint32Array
    - stdLib.Uint8ClampedArray
    - stdLib.Float32Array
    - stdLib.Float64Array
    - stdLib.DataView
    - stdLib.ArrayBuffer
    - FormData
    - java.lang.String
    - scala.Null
  */
  type BodyInit_ = _BodyInit_ | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | java.lang.String | scala.Null
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[scala.Boolean], scala.Unit]
  type Falsy = js.UndefOr[scala.Null | reactDashNativeLib.reactDashNativeLibNumbers.`false`]
  type HeadersInit_ = Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type KeyboardEventListener = js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]
  type NodeHandle = scala.Double
  /**
    * Receive events from native-code
    * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
    * adding all event listeners directly to RCTNativeAppEventEmitter.
    * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\EventEmitter\RCTNativeAppEventEmitter.js
    * @see https://facebook.github.io/react-native/docs/native-modules-ios.html#sending-events-to-javascript
    */
  type RCTNativeAppEventEmitter = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DeviceEventEmitterStatic */ js.Any
  /** Keep a brand of 'T' so that calls to `StyleSheet.flatten` can take `RegisteredStyle<T>` and return `T`. */
  type RegisteredStyle[T] = scala.Double with Anon_RegisteredStyleBrand[T]
  type RequestInfo = Request | java.lang.String
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[scala.Unit]]
  type TaskProvider = js.Function0[Task]
}
