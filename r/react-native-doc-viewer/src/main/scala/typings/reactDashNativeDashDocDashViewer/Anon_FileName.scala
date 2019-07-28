package typings.reactDashNativeDashDocDashViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_FileName {
  @scala.inline
  def apply(url: String, fileName: String = null, fileType: String = null): Anon_FileName = {
    val __obj = js.Dynamic.literal(url = url)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    __obj.asInstanceOf[Anon_FileName]
  }
}

