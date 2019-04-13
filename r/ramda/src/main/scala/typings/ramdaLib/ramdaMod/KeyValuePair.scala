package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair[K, V]
  extends stdLib.Array[K | V] {
  var `0`: K = js.native
  var `1`: V = js.native
}

