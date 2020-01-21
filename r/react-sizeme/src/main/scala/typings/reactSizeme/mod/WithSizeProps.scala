package typings.reactSizeme.mod

import typings.reactSizeme.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithSizeProps extends js.Object {
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.undefined
}

object WithSizeProps {
  @scala.inline
  def apply(onSize: /* size */ AnonHeight => Unit = null): WithSizeProps = {
    val __obj = js.Dynamic.literal()
    if (onSize != null) __obj.updateDynamic("onSize")(js.Any.fromFunction1(onSize))
    __obj.asInstanceOf[WithSizeProps]
  }
}

