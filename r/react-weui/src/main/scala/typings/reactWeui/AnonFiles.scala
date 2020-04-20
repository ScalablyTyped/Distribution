package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  var files: js.Array[_]
  var lang: AnonMaxError
  var maxCount: Double
  var maxWidth: Double
  var onChange: js.Any
  var onError: js.Any
  var title: String
}

object AnonFiles {
  @scala.inline
  def apply(
    files: js.Array[_],
    lang: AnonMaxError,
    maxCount: Double,
    maxWidth: Double,
    onChange: js.Any,
    onError: js.Any,
    title: String
  ): AnonFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiles]
  }
}

