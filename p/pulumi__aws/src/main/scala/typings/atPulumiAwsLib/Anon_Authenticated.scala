package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: js.UndefOr[java.lang.String] = js.undefined
  var unauthenticated: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: java.lang.String = null, unauthenticated: java.lang.String = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated)
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

