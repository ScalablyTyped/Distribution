package typings
package sipDotJsLib.typesExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/exceptions", "Exception")
@js.native
class Exception protected () extends js.Object {
  def this(code: scala.Double, name: java.lang.String, message: java.lang.String) = this()
  var code: scala.Double = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
}

