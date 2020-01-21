package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyleDarkContainerStyleLight extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonDamping | AnonConfig
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnonTranslateY
}

object AnonContainerStyleDarkContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: SceneInterpolatorProps => AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnonTranslateY,
    transitionSpec: AnonDamping | AnonConfig
  ): AnonContainerStyleDarkContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerStyleDarkContainerStyleLight]
  }
}

