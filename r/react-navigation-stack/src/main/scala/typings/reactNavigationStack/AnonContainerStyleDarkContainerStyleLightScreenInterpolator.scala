package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyleDarkContainerStyleLightScreenInterpolator extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonConfigDurationTiming
  def screenInterpolator(): js.Object
}

object AnonContainerStyleDarkContainerStyleLightScreenInterpolator {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: () => js.Object,
    transitionSpec: AnonConfigDurationTiming
  ): AnonContainerStyleDarkContainerStyleLightScreenInterpolator = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction0(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerStyleDarkContainerStyleLightScreenInterpolator]
  }
}

