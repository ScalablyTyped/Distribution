package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/stream.html
@js.native
trait IStream extends js.Object {
  // API: http://vitaly-t.github.io/spex/stream.html#.read
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ scala.Double, /* data */ js.Array[_], /* delay */ scala.Double, _]
  ): stdLib.Promise[TStreamReadResult] = js.native
  // API: http://vitaly-t.github.io/spex/stream.html#.read
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ scala.Double, /* data */ js.Array[_], /* delay */ scala.Double, _],
    options: TStreamReadOptions
  ): stdLib.Promise[TStreamReadResult] = js.native
}

