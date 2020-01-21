package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qIo {
  type QioBufferStream = js.Function2[
    /* buffer */ typings.node.Buffer, 
    /* encoding */ java.lang.String, 
    typings.qIo.Qio.Stream
  ]
}
