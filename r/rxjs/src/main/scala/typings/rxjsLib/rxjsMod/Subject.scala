package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "Subject")
@js.native
class Subject[T] ()
  extends rxjsLib.internalSubjectMod.Subject[T]

@JSImport("rxjs", "Subject")
@js.native
object Subject extends js.Object {
  /**@nocollapse
    * @deprecated use new Subject() instead
    */
  var create: js.Function = js.native
}

