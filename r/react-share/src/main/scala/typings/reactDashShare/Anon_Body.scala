package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /** Body of the email, will be prepended to the url. */
  var body: js.UndefOr[String] = js.undefined
  /** Opens the mail client in a new window. Defaults to false */
  var openWindow: js.UndefOr[Boolean] = js.undefined
  /** Separates body from the url, default: ' ' */
  var separator: js.UndefOr[String] = js.undefined
  /** Title of the shared page */
  var subject: js.UndefOr[String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: String = null,
    openWindow: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    subject: String = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(openWindow)) __obj.updateDynamic("openWindow")(openWindow.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

