package typings.snykConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var secretConfig: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(secretConfig: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (secretConfig != null) __obj.updateDynamic("secretConfig")(secretConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

