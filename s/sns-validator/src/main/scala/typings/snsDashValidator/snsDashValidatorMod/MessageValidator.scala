package typings.snsDashValidator.snsDashValidatorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageValidator extends js.Object {
  /**
    * Validates a message's signature and passes it to the provided callback.
    * @param hash Can be the raw or parsed message.
    * @param cb The callback which is called with the message when it is valid or with an Error when it isn't.
    */
  def validate(hash: String, cb: js.Function2[/* err */ Error | Null, /* message */ js.UndefOr[js.Object], Unit]): Unit = js.native
  def validate(
    hash: js.Object,
    cb: js.Function2[/* err */ Error | Null, /* message */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
}

