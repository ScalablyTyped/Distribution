package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomaticParams extends js.Object {
  var auto: js.UndefOr[ImgixParamType] = js.undefined
}

object AutomaticParams {
  @scala.inline
  def apply(auto: ImgixParamType = null): AutomaticParams = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticParams]
  }
}

