package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadDoneData extends js.Object {
  val progress: Double
  val url: js.UndefOr[String] = js.undefined
}

object FileUploadDoneData {
  @scala.inline
  def apply(progress: Double, url: String = null): FileUploadDoneData = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadDoneData]
  }
}

