package typings

import typings.node.Buffer
import typings.qDashIo.QioNs.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qDashIo {
  type QioBufferStream = js.Function2[/* buffer */ Buffer, /* encoding */ String, Stream]
}
