package typings.reactDashToolbox.libHocActivableRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivableRendererFactoryOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object ActivableRendererFactoryOptions {
  @scala.inline
  def apply(delay: Int | Double = null): ActivableRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivableRendererFactoryOptions]
  }
}

