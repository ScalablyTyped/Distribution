package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNative {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.ArrayBuffer
  import typings.std.DataView
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type AccessibilityChangeEvent = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNative.Blob
    - typings.std.Int8Array
    - typings.std.Int16Array
    - typings.std.Int32Array
    - typings.std.Uint8Array
    - typings.std.Uint16Array
    - typings.std.Uint32Array
    - typings.std.Uint8ClampedArray
    - typings.std.Float32Array
    - typings.std.Float64Array
    - typings.std.DataView
    - typings.std.ArrayBuffer
    - typings.reactDashNative.FormData
    - java.lang.String
    - scala.Null
  */
  type BodyInit_ = _BodyInit_ | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | String | Null
  type HeadersInit_ = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  type NodeHandle = Double
  type RequestInfo = Request | String
}
