package typings
package reactDashNativeDashDocDashViewerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var base64: java.lang.String
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var fileType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(base64: java.lang.String, fileName: java.lang.String = null, fileType: java.lang.String = null): Anon_Base64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base64")(base64)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    __obj.asInstanceOf[Anon_Base64]
  }
}

