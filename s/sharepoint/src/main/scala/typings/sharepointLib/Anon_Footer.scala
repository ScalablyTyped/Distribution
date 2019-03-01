package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Footer extends js.Object {
  var Footer: scala.Double
  var Loading: scala.Double
  var Option: scala.Double
  var Separator: scala.Double
}

object Anon_Footer {
  @scala.inline
  def apply(Footer: scala.Double, Loading: scala.Double, Option: scala.Double, Separator: scala.Double): Anon_Footer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Footer")(Footer)
    __obj.updateDynamic("Loading")(Loading)
    __obj.updateDynamic("Option")(Option)
    __obj.updateDynamic("Separator")(Separator)
    __obj.asInstanceOf[Anon_Footer]
  }
}

