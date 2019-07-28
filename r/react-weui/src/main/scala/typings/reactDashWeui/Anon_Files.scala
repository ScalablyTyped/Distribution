package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[_]
  var lang: Anon_MaxError
  var maxCount: Double
  var maxWidth: Double
  var onChange: js.Any
  var onError: js.Any
  var title: String
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[_],
    lang: Anon_MaxError,
    maxCount: Double,
    maxWidth: Double,
    onChange: js.Any,
    onError: js.Any,
    title: String
  ): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files, lang = lang, maxCount = maxCount, maxWidth = maxWidth, onChange = onChange, onError = onError, title = title)
  
    __obj.asInstanceOf[Anon_Files]
  }
}

