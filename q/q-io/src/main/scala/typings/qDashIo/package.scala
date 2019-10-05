package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qDashIo {
  import typings.node.Buffer
  import typings.qDashIo.Qio.Stream

  type QioBufferStream = js.Function2[/* buffer */ Buffer, /* encoding */ String, Stream]
}
