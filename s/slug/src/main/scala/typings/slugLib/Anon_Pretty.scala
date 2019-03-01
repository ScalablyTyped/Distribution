package typings
package slugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pretty extends js.Object {
  var pretty: slugLib.slugMod.Mode
  var rfc3986: slugLib.slugMod.Mode
}

object Anon_Pretty {
  @scala.inline
  def apply(pretty: slugLib.slugMod.Mode, rfc3986: slugLib.slugMod.Mode): Anon_Pretty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pretty")(pretty)
    __obj.updateDynamic("rfc3986")(rfc3986)
    __obj.asInstanceOf[Anon_Pretty]
  }
}

