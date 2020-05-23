package typings.reactToolbox.activableRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivableRendererFactoryOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object ActivableRendererFactoryOptions {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined): ActivableRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivableRendererFactoryOptions]
  }
}

