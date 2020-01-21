package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyleDark extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonDamping | AnonConfig
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityOverlayOpacity | AnonOpacityOverlayOpacityShadowOpacity
}

object AnonContainerStyleDark {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: SceneInterpolatorProps => AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityOverlayOpacity | AnonOpacityOverlayOpacityShadowOpacity,
    transitionSpec: AnonDamping | AnonConfig
  ): AnonContainerStyleDark = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerStyleDark]
  }
}

