package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondHookProps extends js.Object {
  var beforeRemoveFile: js.UndefOr[js.Function1[/* file */ File, scala.Boolean]] = js.undefined
}

object FilePondHookProps {
  @scala.inline
  def apply(beforeRemoveFile: js.Function1[/* file */ File, scala.Boolean] = null): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(beforeRemoveFile)
    __obj.asInstanceOf[FilePondHookProps]
  }
}

