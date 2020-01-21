package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderStyleInterpolator", JSImport.Namespace)
@js.native
object headerStyleInterpolatorMod extends js.Object {
  @js.native
  object default extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithFade: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithTranslation: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forCenter: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolation
      ] = js.native
    var forLayout: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonTransform | AnonTransformAnonTranslateX | AnonTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forLeft: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftButton: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolation
      ] = js.native
    var forRight: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
  }
  
}

