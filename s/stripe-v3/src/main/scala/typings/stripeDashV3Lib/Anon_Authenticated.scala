package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: scala.Boolean
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: scala.Boolean): Anon_Authenticated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticated")(authenticated)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

