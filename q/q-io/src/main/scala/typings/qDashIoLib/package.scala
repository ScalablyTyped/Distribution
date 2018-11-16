package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qDashIoLib {
  type QioBufferStream = js.Function2[
    /* buffer */ nodeLib.Buffer, 
    /* encoding */ java.lang.String, 
    qDashIoLib.QioNs.Stream
  ]
}
