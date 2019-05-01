package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeLib {
  type AccessibilityChangeEvent = scala.Boolean
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
  type HeadersInit_ = Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type NodeHandle = scala.Double
  type RequestInfo = Request | java.lang.String
}
