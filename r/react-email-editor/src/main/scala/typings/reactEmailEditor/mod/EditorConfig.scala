package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorConfig extends js.Object {
  val maxRows: js.UndefOr[Double] = js.undefined
  val minRows: js.UndefOr[Double] = js.undefined
}

object EditorConfig {
  @scala.inline
  def apply(maxRows: Int | Double = null, minRows: Int | Double = null): EditorConfig = {
    val __obj = js.Dynamic.literal()
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorConfig]
  }
}

