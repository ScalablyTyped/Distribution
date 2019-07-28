package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoResult extends js.Object {
  var ignored: Boolean
  var inferredParser: String | Null
}

object FileInfoResult {
  @scala.inline
  def apply(ignored: Boolean, inferredParser: String = null): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored)
    if (inferredParser != null) __obj.updateDynamic("inferredParser")(inferredParser)
    __obj.asInstanceOf[FileInfoResult]
  }
}

