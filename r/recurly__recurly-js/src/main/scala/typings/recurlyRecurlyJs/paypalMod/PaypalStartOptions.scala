package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.AnonDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaypalStartOptions extends js.Object {
  var options: js.UndefOr[AnonDescription] = js.undefined
}

object PaypalStartOptions {
  @scala.inline
  def apply(options: AnonDescription = null): PaypalStartOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaypalStartOptions]
  }
}

