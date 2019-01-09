package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeLib {
  type AccessibilityChangeEvent = scala.Boolean
  type AccessibilityEvent = AccessibilityChangeEvent | AccessibilityAnnoucementFinishedEvent
  type AccessibilityEventName = reactDashNativeLib.reactDashNativeLibStrings.change | reactDashNativeLib.reactDashNativeLibStrings.announcementFinished
  type AccessibilityTrait = reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.link | reactDashNativeLib.reactDashNativeLibStrings.header | reactDashNativeLib.reactDashNativeLibStrings.search | reactDashNativeLib.reactDashNativeLibStrings.image | reactDashNativeLib.reactDashNativeLibStrings.selected | reactDashNativeLib.reactDashNativeLibStrings.plays | reactDashNativeLib.reactDashNativeLibStrings.key | reactDashNativeLib.reactDashNativeLibStrings.text | reactDashNativeLib.reactDashNativeLibStrings.summary | reactDashNativeLib.reactDashNativeLibStrings.disabled | reactDashNativeLib.reactDashNativeLibStrings.frequentUpdates | reactDashNativeLib.reactDashNativeLibStrings.startsMedia | reactDashNativeLib.reactDashNativeLibStrings.adjustable | reactDashNativeLib.reactDashNativeLibStrings.allowsDirectInteraction | reactDashNativeLib.reactDashNativeLibStrings.pageTurn
  type BackgroundPropType = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RippleBackgroundPropType */ js.Any
  type `BodyInit_` = Blob | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | FormData | java.lang.String | scala.Null
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type DataDetectorTypes = reactDashNativeLib.reactDashNativeLibStrings.phoneNumber | reactDashNativeLib.reactDashNativeLibStrings.link | reactDashNativeLib.reactDashNativeLibStrings.address | reactDashNativeLib.reactDashNativeLibStrings.calendarEvent | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.all
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[scala.Boolean], scala.Unit]
  type Falsy = js.UndefOr[scala.Null | reactDashNativeLib.reactDashNativeLibNumbers.`false`]
  type FlexAlignType = reactDashNativeLib.reactDashNativeLibStrings.`flex-start` | reactDashNativeLib.reactDashNativeLibStrings.`flex-end` | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.stretch | reactDashNativeLib.reactDashNativeLibStrings.baseline
  type `HeadersInit_` = Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
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
  type `RequestCredentials_` = reactDashNativeLib.reactDashNativeLibStrings.omit | reactDashNativeLib.reactDashNativeLibStrings.`same-origin` | reactDashNativeLib.reactDashNativeLibStrings.include
  type RequestInfo = Request | java.lang.String
  type `RequestMode_` = reactDashNativeLib.reactDashNativeLibStrings.navigate | reactDashNativeLib.reactDashNativeLibStrings.`same-origin` | reactDashNativeLib.reactDashNativeLibStrings.`no-cors` | reactDashNativeLib.reactDashNativeLibStrings.cors
  type `ResponseType_` = reactDashNativeLib.reactDashNativeLibStrings.basic | reactDashNativeLib.reactDashNativeLibStrings.cors | reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.error | reactDashNativeLib.reactDashNativeLibStrings.opaque | reactDashNativeLib.reactDashNativeLibStrings.opaqueredirect
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[scala.Unit]]
  type TaskProvider = js.Function0[Task]
  type XMLHttpRequestResponseType = reactDashNativeLib.reactDashNativeLibStrings.Empty | reactDashNativeLib.reactDashNativeLibStrings.arraybuffer | reactDashNativeLib.reactDashNativeLibStrings.blob | reactDashNativeLib.reactDashNativeLibStrings.document | reactDashNativeLib.reactDashNativeLibStrings.json | reactDashNativeLib.reactDashNativeLibStrings.text
}
