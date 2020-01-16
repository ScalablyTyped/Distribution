package typings.atStorybookAddonDashStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var kind: js.Any
}

object Anon_FileName {
  @scala.inline
  def apply(kind: js.Any, fileName: String = null): Anon_FileName = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileName]
  }
}

