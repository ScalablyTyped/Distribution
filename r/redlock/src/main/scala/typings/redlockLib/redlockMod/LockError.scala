package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redlock", "LockError")
@js.native
class LockError ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  val name_LockError: redlockLib.redlockLibStrings.LockError = js.native
}

