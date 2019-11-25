package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var Email: js.UndefOr[String] = js.undefined
  var FirstName: js.UndefOr[String] = js.undefined
  var FullName: js.UndefOr[String] = js.undefined
  var Identifier: js.UndefOr[String] = js.undefined
  var IsAnonymous: js.UndefOr[Boolean] = js.undefined
  var UUID: js.UndefOr[js.Any] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    Email: String = null,
    FirstName: String = null,
    FullName: String = null,
    Identifier: String = null,
    IsAnonymous: js.UndefOr[Boolean] = js.undefined,
    UUID: js.Any = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (FullName != null) __obj.updateDynamic("FullName")(FullName.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(IsAnonymous)) __obj.updateDynamic("IsAnonymous")(IsAnonymous.asInstanceOf[js.Any])
    if (UUID != null) __obj.updateDynamic("UUID")(UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Email]
  }
}

