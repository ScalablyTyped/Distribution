package typings.reactDashNavigationDashStack

import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerStyleDark extends js.Object {
  var containerStyleDark: Anon_BackgroundColor
  var containerStyleLight: Anon_BackgroundColor
  var transitionSpec: Anon_Damping | Anon_Config
  def screenInterpolator(props: SceneInterpolatorProps): Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityOverlayOpacity | Anon_OpacityOverlayOpacityShadowOpacity
}

object Anon_ContainerStyleDark {
  @scala.inline
  def apply(
    containerStyleDark: Anon_BackgroundColor,
    containerStyleLight: Anon_BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityOverlayOpacity | Anon_OpacityOverlayOpacityShadowOpacity,
    transitionSpec: Anon_Damping | Anon_Config
  ): Anon_ContainerStyleDark = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerStyleDark]
  }
}

