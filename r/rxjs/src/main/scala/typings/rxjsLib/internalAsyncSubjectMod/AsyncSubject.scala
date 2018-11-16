package typings
package rxjsLib.internalAsyncSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/AsyncSubject", "AsyncSubject")
@js.native
class AsyncSubject[T] ()
  extends rxjsLib.internalSubjectMod.Subject[T] {
  var hasCompleted: js.Any = js.native
  var hasNext: js.Any = js.native
  var value: js.Any = js.native
}

