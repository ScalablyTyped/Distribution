package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoResult extends js.Object {
  var ignored: scala.Boolean
  var inferredParser: java.lang.String | scala.Null
}

object FileInfoResult {
  @scala.inline
  def apply(ignored: scala.Boolean, inferredParser: java.lang.String = null): FileInfoResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignored")(ignored)
    if (inferredParser != null) __obj.updateDynamic("inferredParser")(inferredParser)
    __obj.asInstanceOf[FileInfoResult]
  }
}

