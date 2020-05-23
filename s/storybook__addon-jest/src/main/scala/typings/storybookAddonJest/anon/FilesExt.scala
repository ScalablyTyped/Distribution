package typings.storybookAddonJest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesExt extends js.Object {
  var filesExt: js.UndefOr[String] = js.undefined
  var results: js.Any
}

object FilesExt {
  @scala.inline
  def apply(results: js.Any, filesExt: String = null): FilesExt = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (filesExt != null) __obj.updateDynamic("filesExt")(filesExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesExt]
  }
}

