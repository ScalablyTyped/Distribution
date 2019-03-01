package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticatedUnauthenticated extends js.Object {
  var authenticated: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var unauthenticated: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AuthenticatedUnauthenticated {
  @scala.inline
  def apply(
    authenticated: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    unauthenticated: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AuthenticatedUnauthenticated = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated.asInstanceOf[js.Any])
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticatedUnauthenticated]
  }
}

