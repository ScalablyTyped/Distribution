package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNative {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.ArrayBuffer
  import typings.std.Blob
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

  type BodyInit_ = Blob | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | FormData | String | Null
  type HeadersInit_ = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  type RequestInfo = Request | String
}
