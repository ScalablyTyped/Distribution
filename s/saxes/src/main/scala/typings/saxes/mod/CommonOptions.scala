package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * A file name to use for error reporting. "File name" is a loose concept. You
    * could use a URL to some resource, or any descriptive name you like.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** Whether to accept XML fragments. Unset means ``false``. */
  var fragment: js.UndefOr[Boolean] = js.undefined
  /** Whether to track positions. Unset means ``true``. */
  var position: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    fileName: String = null,
    fragment: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(fragment)) __obj.updateDynamic("fragment")(fragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

