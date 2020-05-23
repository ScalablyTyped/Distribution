package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePropertyBag extends BlobPropertyBag {
  var lastModified: js.UndefOr[Double] = js.undefined
}

object FilePropertyBag {
  @scala.inline
  def apply(
    endings: EndingType = null,
    lastModified: js.UndefOr[Double] = js.undefined,
    `type`: java.lang.String = null
  ): FilePropertyBag = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePropertyBag]
  }
}

