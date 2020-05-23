package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalStartOptions extends js.Object {
  var options: Description
}

object PayPalStartOptions {
  @scala.inline
  def apply(options: Description): PayPalStartOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalStartOptions]
  }
}

