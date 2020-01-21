package typings.promiseAbortable.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortablePromise[T] extends Promise[T] {
  def abort(): AbortablePromise[T] = js.native
  def abort(reason: js.Any): AbortablePromise[T] = js.native
}

