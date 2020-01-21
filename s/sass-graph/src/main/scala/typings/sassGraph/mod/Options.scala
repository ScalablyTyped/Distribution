package typings.sassGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var loadPath: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(extensions: js.Array[String] = null, loadPath: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

