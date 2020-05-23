package typings.reactNativeHtmlToPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pdf extends js.Object {
  var base64: js.UndefOr[String] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
}

object Pdf {
  @scala.inline
  def apply(base64: String = null, filePath: String = null): Pdf = {
    val __obj = js.Dynamic.literal()
    if (base64 != null) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pdf]
  }
}

