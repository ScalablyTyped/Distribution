package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator extends js.Object {
  var containerStyleDark: Anon_BackgroundColor
  var containerStyleLight: Anon_BackgroundColor
  var transitionSpec: Anon_ConfigDurationTiming
  def screenInterpolator(): js.Object
}

object Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator {
  @scala.inline
  def apply(
    containerStyleDark: Anon_BackgroundColor,
    containerStyleLight: Anon_BackgroundColor,
    screenInterpolator: () => js.Object,
    transitionSpec: Anon_ConfigDurationTiming
  ): Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction0(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator]
  }
}

