package typings.reactNativeDocViewer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var url: String
}

object FileName {
  @scala.inline
  def apply(url: String, fileName: String = null, fileType: String = null): FileName = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

