package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.anon.Name
import typings.reactNative.reactNativeStrings.close
import typings.reactNative.reactNativeStrings.error
import typings.reactNative.reactNativeStrings.message
import typings.reactNative.reactNativeStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.reactNative.SourceUri
  - typings.reactNative.Blob
  - js.typedarray.Int8Array
  - js.typedarray.Int16Array
  - js.typedarray.Int32Array
  - js.typedarray.Uint8Array
  - js.typedarray.Uint16Array
  - js.typedarray.Uint32Array
  - js.typedarray.Uint8ClampedArray
  - js.typedarray.Float32Array
  - js.typedarray.Float64Array
  - js.typedarray.DataView
  - js.typedarray.ArrayBuffer
  - typings.reactNative.FormData
  - java.lang.String
  - scala.Null
*/
type BodyInit = _BodyInit | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | String | Null

type FormDataValue = String | Name

type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]

type RequestInfo = Request | String

type WebsocketCloseEventListener = js.Function2[close, /* handler */ js.Function1[/* e */ WebSocketCloseEvent, Unit], Unit]

type WebsocketErrorEventListener = js.Function2[error, /* handler */ js.Function1[/* e */ WebSocketErrorEvent, Unit], Unit]

type WebsocketMessageEventListener = js.Function2[message, /* handler */ js.Function1[/* e */ WebSocketMessageEvent, Unit], Unit]

type WebsocketOpenEventListener = js.Function2[open, /* handler */ js.Function0[Unit], Unit]
