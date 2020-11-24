package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.Exception")
@js.native
abstract class Exception protected ()
  extends typings.sipJs.coreMod.Exception {
  protected def this(message: String) = this()
}
