package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectConfig extends PayPalConfig {
  var display: js.UndefOr[DisplayName] = js.undefined
}

object DirectConfig {
  @scala.inline
  def apply(display: DisplayName = null): DirectConfig = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectConfig]
  }
}

