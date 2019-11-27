package typings.reactDashNavigationDashStack

import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Props extends js.Object {
  var transitionSpec: Anon_ConfigDuration
  def screenInterpolator(props: SceneInterpolatorProps): Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY
}

object Anon_Props {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY,
    transitionSpec: Anon_ConfigDuration
  ): Anon_Props = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Props]
  }
}

