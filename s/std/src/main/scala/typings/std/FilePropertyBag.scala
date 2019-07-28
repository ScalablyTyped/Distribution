package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePropertyBag extends BlobPropertyBag {
  var lastModified: js.UndefOr[Double] = js.undefined
}

object FilePropertyBag {
  @scala.inline
  def apply(endings: EndingType = null, lastModified: Int | Double = null, `type`: java.lang.String = null): FilePropertyBag = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilePropertyBag]
  }
}

