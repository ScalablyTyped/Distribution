package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBufferView extends js.Object {
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  var buffer: ArrayBufferLike
  /**
    * The length in bytes of the array.
    */
  var byteLength: scala.Double
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: scala.Double
}

