package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: js.UndefOr[String] = js.undefined
  var unauthenticated: js.UndefOr[String] = js.undefined
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: String = null, unauthenticated: String = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated)
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

