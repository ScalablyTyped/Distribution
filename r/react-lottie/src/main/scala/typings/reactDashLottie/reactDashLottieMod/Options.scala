package typings.reactDashLottie.reactDashLottieMod

import typings.reactDashLottie.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The JSON data exported from Adobe After Effects using the Bodymovin plugin
    */
  var animationData: js.Any
  /**
    * Defines if the animation should immediately play when the component enters the DOM
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if the animation should play only once or repeatedly in an endless loop
    * or the number of loops that should be completed before the animation ends
    */
  var loop: js.UndefOr[Boolean | Double] = js.undefined
  var rendererSettings: js.UndefOr[Anon_ClassName] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animationData: js.Any,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: Boolean | Double = null,
    rendererSettings: Anon_ClassName = null
  ): Options = {
    val __obj = js.Dynamic.literal(animationData = animationData.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (rendererSettings != null) __obj.updateDynamic("rendererSettings")(rendererSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

