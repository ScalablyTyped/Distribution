package typings.atStorybookAddonDashJest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilesExt extends js.Object {
  var filesExt: js.UndefOr[String] = js.undefined
  var results: js.Any
}

object Anon_FilesExt {
  @scala.inline
  def apply(results: js.Any, filesExt: String = null): Anon_FilesExt = {
    val __obj = js.Dynamic.literal(results = results)
    if (filesExt != null) __obj.updateDynamic("filesExt")(filesExt)
    __obj.asInstanceOf[Anon_FilesExt]
  }
}

