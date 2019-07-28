package typings.reactDashFilepond.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondHookProps extends js.Object {
  var beforeRemoveFile: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.undefined
}

object FilePondHookProps {
  @scala.inline
  def apply(beforeRemoveFile: /* file */ File => Boolean = null): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(js.Any.fromFunction1(beforeRemoveFile))
    __obj.asInstanceOf[FilePondHookProps]
  }
}

