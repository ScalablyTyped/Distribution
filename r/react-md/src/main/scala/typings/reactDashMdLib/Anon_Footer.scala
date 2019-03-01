package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Footer extends js.Object {
  var footer: scala.Boolean
  var header: scala.Boolean
}

object Anon_Footer {
  @scala.inline
  def apply(footer: scala.Boolean, header: scala.Boolean): Anon_Footer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("footer")(footer)
    __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[Anon_Footer]
  }
}

