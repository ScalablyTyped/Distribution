package typings.spex.spexMod

import typings.spex.Anon_Cb
import typings.spex.Anon_Data
import typings.spex.Anon_DataDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Subset of the base methods only, to be used by pg-promise
@js.native
trait ISpexBase extends js.Object {
  // API: http://vitaly-t.github.io/spex/global.html#batch
  def batch(values: js.Array[_]): js.Promise[IArrayExt[_]] = js.native
  def batch(values: js.Array[_], options: Anon_Cb): js.Promise[IArrayExt[_]] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#page
  def page(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]): js.Promise[IPageResult] = js.native
  def page(
    source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _],
    options: Anon_Data
  ): js.Promise[IPageResult] = js.native
  // API: http://vitaly-t.github.io/spex/global.html#sequence
  def sequence(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]): js.Promise[ISequenceResult | IArrayExt[_]] = js.native
  def sequence(
    source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _],
    options: Anon_DataDelay
  ): js.Promise[ISequenceResult | IArrayExt[_]] = js.native
}

