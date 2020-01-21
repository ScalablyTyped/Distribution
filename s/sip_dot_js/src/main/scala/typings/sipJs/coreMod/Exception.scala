package typings.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Exception")
@js.native
abstract class Exception protected ()
  extends typings.sipJs.coreExceptionsMod.Exception {
  protected def this(message: String) = this()
}

