package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobPropertyBag extends js.Object {
  var endings: js.UndefOr[EndingType] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BlobPropertyBag {
  @scala.inline
  def apply(endings: EndingType = null, `type`: java.lang.String = null): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobPropertyBag]
  }
}

