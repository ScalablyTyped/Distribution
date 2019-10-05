package typings.rxjs

import typings.rxjs.internalSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/AsyncSubject", JSImport.Namespace)
@js.native
object internalAsyncSubjectMod extends js.Object {
  @js.native
  class AsyncSubject[T] () extends Subject[T] {
    var hasCompleted: js.Any = js.native
    var hasNext: js.Any = js.native
    var value: js.Any = js.native
  }
  
}

