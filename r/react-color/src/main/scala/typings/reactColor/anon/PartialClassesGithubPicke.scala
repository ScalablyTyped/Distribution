package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps>> */
trait PartialClassesGithubPicke extends js.Object {
  var default: js.UndefOr[PartialGithubPickerStyles] = js.undefined
}

object PartialClassesGithubPicke {
  @scala.inline
  def apply(default: PartialGithubPickerStyles = null): PartialClassesGithubPicke = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesGithubPicke]
  }
}

