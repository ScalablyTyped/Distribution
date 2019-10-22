package typings.reactDashSizeme.reactDashSizemeMod

import typings.reactDashSizeme.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithSizeProps extends js.Object {
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.undefined
}

object WithSizeProps {
  @scala.inline
  def apply(onSize: /* size */ Anon_Height => Unit = null): WithSizeProps = {
    val __obj = js.Dynamic.literal()
    if (onSize != null) __obj.updateDynamic("onSize")(js.Any.fromFunction1(onSize))
    __obj.asInstanceOf[WithSizeProps]
  }
}

