package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeConfig extends js.Object {
  var sizes: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
}

object AttributeConfig {
  @scala.inline
  def apply(sizes: String = null, src: String = null, srcSet: String = null): AttributeConfig = {
    val __obj = js.Dynamic.literal()
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeConfig]
  }
}

