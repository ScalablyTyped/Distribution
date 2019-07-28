package typings.rxjs.internalAsyncSubjectMod

import typings.rxjs.internalSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/AsyncSubject", "AsyncSubject")
@js.native
class AsyncSubject[T] () extends Subject[T] {
  var hasCompleted: js.Any = js.native
  var hasNext: js.Any = js.native
  var value: js.Any = js.native
}

