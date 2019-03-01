package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLink extends js.Object {
  var access: scala.Boolean
  var link: scala.Boolean
}

object Anon_AccessLink {
  @scala.inline
  def apply(access: scala.Boolean, link: scala.Boolean): Anon_AccessLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access")(access)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Anon_AccessLink]
  }
}

