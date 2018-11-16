package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScopedCredentialDescriptor extends js.Object {
  var id: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | scala.Null
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  var `type`: ScopedCredentialType
}

