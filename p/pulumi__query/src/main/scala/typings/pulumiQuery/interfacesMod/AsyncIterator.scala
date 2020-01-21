package typings.pulumiQuery.interfacesMod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncIterator[T] extends js.Object {
  var `return`: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], js.Promise[IteratorResult[T, _]]]] = js.native
  var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], js.Promise[IteratorResult[T, _]]]] = js.native
  def next(): js.Promise[IteratorResult[T, _]] = js.native
  def next(value: js.Any): js.Promise[IteratorResult[T, _]] = js.native
}

