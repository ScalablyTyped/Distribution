package typings.storybookAddonJest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilesExt extends js.Object {
  var filesExt: js.UndefOr[String] = js.undefined
  var results: js.Any
}

object AnonFilesExt {
  @scala.inline
  def apply(results: js.Any, filesExt: String = null): AnonFilesExt = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (filesExt != null) __obj.updateDynamic("filesExt")(filesExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilesExt]
  }
}

