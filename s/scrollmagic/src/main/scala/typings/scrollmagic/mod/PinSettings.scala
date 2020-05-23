package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinSettings extends js.Object {
  var pushFollowers: js.UndefOr[Boolean] = js.undefined
  var spacerClass: js.UndefOr[String] = js.undefined
}

object PinSettings {
  @scala.inline
  def apply(pushFollowers: js.UndefOr[Boolean] = js.undefined, spacerClass: String = null): PinSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pushFollowers)) __obj.updateDynamic("pushFollowers")(pushFollowers.get.asInstanceOf[js.Any])
    if (spacerClass != null) __obj.updateDynamic("spacerClass")(spacerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinSettings]
  }
}

