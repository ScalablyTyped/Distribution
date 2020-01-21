package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps extends js.Object {
  var transitionSpec: AnonConfigDuration
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY
}

object AnonProps {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY,
    transitionSpec: AnonConfigDuration
  ): AnonProps = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProps]
  }
}

