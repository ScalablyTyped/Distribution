package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewStyleInterpolator", JSImport.Namespace)
@js.native
object stackViewStyleInterpolatorMod extends js.Object {
  @js.native
  object default extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacity | AnonOpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityOverlayOpacity | AnonOpacityOverlayOpacityShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnonTranslateY
      ] = js.native
  }
  
}

