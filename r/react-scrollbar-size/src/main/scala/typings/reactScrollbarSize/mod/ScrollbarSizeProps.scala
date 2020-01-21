package typings.reactScrollbarSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarSizeProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
}

object ScrollbarSizeProps {
  @scala.inline
  def apply(
    onChange: /* measurement */ Measurement => Unit = null,
    onLoad: /* measurement */ Measurement => Unit = null
  ): ScrollbarSizeProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    __obj.asInstanceOf[ScrollbarSizeProps]
  }
}

