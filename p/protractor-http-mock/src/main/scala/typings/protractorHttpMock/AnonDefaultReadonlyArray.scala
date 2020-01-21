package typings.protractorHttpMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultReadonlyArray extends js.Object {
  /**
    * Collection of default plugins to load for every test.
    * Default: []
    */
  var default: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonDefaultReadonlyArray {
  @scala.inline
  def apply(default: js.Array[String] = null): AnonDefaultReadonlyArray = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultReadonlyArray]
  }
}

