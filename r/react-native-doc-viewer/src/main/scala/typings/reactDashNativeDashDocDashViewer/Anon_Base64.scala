package typings.reactDashNativeDashDocDashViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var base64: String
  var fileName: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(base64: String, fileName: String = null, fileType: String = null): Anon_Base64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

