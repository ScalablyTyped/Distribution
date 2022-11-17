package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.anon.Name
import typings.reactNative.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BodyInit = SourceUri | Blob | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | FormData | String | Null

type FormDataPart = typings.reactNative.anon.Headers | Type

type FormDataValue = String | Name

type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]

type RequestCredentials = "omit" | "same-origin" | "include"

type RequestInfo = Request | String

type RequestMode = "navigate" | "same-origin" | "no-cors" | "cors"

type ResponseType = "basic" | "cors" | "default" | "error" | "opaque" | "opaqueredirect"

type WebsocketCloseEventListener = js.Function2[
/* event */ "close", 
/* handler */ js.Function1[/* e */ WebSocketCloseEvent, Unit], 
Unit]

type WebsocketErrorEventListener = js.Function2[
/* event */ "error", 
/* handler */ js.Function1[/* e */ WebSocketErrorEvent, Unit], 
Unit]

type WebsocketMessageEventListener = js.Function2[
/* event */ "message", 
/* handler */ js.Function1[/* e */ WebSocketMessageEvent, Unit], 
Unit]

type WebsocketOpenEventListener = js.Function2[/* event */ "open", /* handler */ js.Function0[Unit], Unit]

type XMLHttpRequestResponseType = "" | "arraybuffer" | "blob" | "document" | "json" | "text"
