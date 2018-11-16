package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Subset of the base methods only, to be used by pg-promise
@js.native
trait ISpexBase extends js.Object {
  // API: http://vitaly-t.github.io/spex/global.html#batch
  def batch(values: js.Array[_]): stdLib.Promise[IArrayExt[_]] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#batch
  def batch(values: js.Array[_], options: spexLib.Anon_Cb): stdLib.Promise[IArrayExt[_]] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#page
  def page(source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]): stdLib.Promise[TPageResult] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#page
  def page(
    source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _],
    options: spexLib.Anon_Limit
  ): stdLib.Promise[TPageResult] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#sequence
  def sequence(source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]): stdLib.Promise[TSequenceResult | IArrayExt[_]] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#sequence
  def sequence(
    source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _],
    options: spexLib.Anon_LimitTrack
  ): stdLib.Promise[TSequenceResult | IArrayExt[_]] = js.native
}

