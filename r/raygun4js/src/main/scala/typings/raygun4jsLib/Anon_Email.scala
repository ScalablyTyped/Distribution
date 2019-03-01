package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var Email: js.UndefOr[java.lang.String] = js.undefined
  var FirstName: js.UndefOr[java.lang.String] = js.undefined
  var FullName: js.UndefOr[java.lang.String] = js.undefined
  var Identifier: js.UndefOr[java.lang.String] = js.undefined
  var IsAnonymous: js.UndefOr[scala.Boolean] = js.undefined
  var UUID: js.UndefOr[js.Any] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    Email: java.lang.String = null,
    FirstName: java.lang.String = null,
    FullName: java.lang.String = null,
    Identifier: java.lang.String = null,
    IsAnonymous: js.UndefOr[scala.Boolean] = js.undefined,
    UUID: js.Any = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (FullName != null) __obj.updateDynamic("FullName")(FullName)
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier)
    if (!js.isUndefined(IsAnonymous)) __obj.updateDynamic("IsAnonymous")(IsAnonymous)
    if (UUID != null) __obj.updateDynamic("UUID")(UUID)
    __obj.asInstanceOf[Anon_Email]
  }
}

