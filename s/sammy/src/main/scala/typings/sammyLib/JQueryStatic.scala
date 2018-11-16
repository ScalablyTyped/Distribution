package typings
package sammyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var log: js.Function = js.native
  @JSName("sammy")
  var sammy_Original: sammyLib.SammyNs.SammyFunc = js.native
  def sammy(): sammyLib.SammyNs.Application = js.native
  def sammy(handler: js.Function): sammyLib.SammyNs.Application = js.native
  def sammy(selector: java.lang.String): sammyLib.SammyNs.Application = js.native
  def sammy(selector: java.lang.String, handler: js.Function): sammyLib.SammyNs.Application = js.native
}

