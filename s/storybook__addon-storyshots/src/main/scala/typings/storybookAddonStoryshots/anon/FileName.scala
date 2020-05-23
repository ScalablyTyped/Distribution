package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var kind: js.Any
}

object FileName {
  @scala.inline
  def apply(kind: js.Any, fileName: String = null): FileName = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

