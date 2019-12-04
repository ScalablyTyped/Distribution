package typings.rxjs.internalRxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "Subject")
@js.native
class Subject[T] ()
  extends typings.rxjs.internalSubjectMod.Subject[T]

/* static members */
@JSImport("rxjs/internal/Rx", "Subject")
@js.native
object Subject extends js.Object {
  /**@nocollapse
    * @deprecated use new Subject() instead
    */
  var create: js.Function = js.native
}

