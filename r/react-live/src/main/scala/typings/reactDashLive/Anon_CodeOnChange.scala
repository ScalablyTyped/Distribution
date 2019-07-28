package typings.reactDashLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeOnChange extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* code */ String, Unit]] = js.undefined
}

object Anon_CodeOnChange {
  @scala.inline
  def apply(onChange: /* code */ String => Unit = null): Anon_CodeOnChange = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Anon_CodeOnChange]
  }
}

