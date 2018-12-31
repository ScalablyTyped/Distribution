package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Subset of the base methods only, to be used by pg-promise
@js.native
trait ISpexBase extends js.Object {
  // API: http://vitaly-t.github.io/spex/global.html#batch
  def batch(values: js.Array[_]): js.Promise[IArrayExt[_]] = js.native
  def batch(values: js.Array[_], options: spexLib.Anon_Cb): js.Promise[IArrayExt[_]] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#page
  def page(source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]): js.Promise[TPageResult] = js.native
  def page(
    source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _],
    options: spexLib.Anon_Limit
  ): js.Promise[TPageResult] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#sequence
  def sequence(source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]): js.Promise[TSequenceResult | IArrayExt[_]] = js.native
  def sequence(
    source: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _],
    options: spexLib.Anon_LimitTrack
  ): js.Promise[TSequenceResult | IArrayExt[_]] = js.native
}

