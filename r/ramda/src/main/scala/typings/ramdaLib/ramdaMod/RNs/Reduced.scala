package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[T] extends js.Object {
  var `@@transducer/reduced`: ramdaLib.ramdaLibNumbers.`true`
  var `@@transducer/value`: T
}

object Reduced {
  @scala.inline
  def apply[T](`@@transducer/reduced`: ramdaLib.ramdaLibNumbers.`true`, `@@transducer/value`: T): Reduced[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducer/reduced`)
    __obj.updateDynamic("@@transducer/value")(`@@transducer/value`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[T]]
  }
}

