package typings
package sassDashGraphLib.sassDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var loadPath: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(extensions: js.Array[java.lang.String] = null, loadPath: js.Array[java.lang.String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath)
    __obj.asInstanceOf[Options]
  }
}

