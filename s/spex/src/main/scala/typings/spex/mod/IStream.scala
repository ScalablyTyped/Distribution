package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/stream.html
@js.native
trait IStream extends js.Object {
  // API: http://vitaly-t.github.io/spex/stream.html#.read
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ Double, /* data */ js.Array[_], /* delay */ Double, _]
  ): js.Promise[IStreamReadResult] = js.native
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ Double, /* data */ js.Array[_], /* delay */ Double, _],
    options: IStreamReadOptions
  ): js.Promise[IStreamReadResult] = js.native
}

