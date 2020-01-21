package typings.simplestorageJs.mod.simplestoragejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
    * Sets the time-to-live (TTL) value in milliseconds for the given key/value.
    */
  var TTL: js.UndefOr[Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(TTL: Int | Double = null): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (TTL != null) __obj.updateDynamic("TTL")(TTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

