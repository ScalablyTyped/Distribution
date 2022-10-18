package typings.storybookReactNative

import typings.reactNative.mod.Animated.Value
import typings.storybookReactNative.anon.Transform
import typings.storybookReactNative.anon.TransformArray
import typings.storybookReactNative.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUIAnimationMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAddonPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAddonPanelPosition")(animatedValue.asInstanceOf[js.Any], previewWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform]]
  
  inline def getNavigatorPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNavigatorPanelPosition")(animatedValue.asInstanceOf[js.Any], previewWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform]]
  
  inline def getPreviewPosition(animatedValue: Value, previewWidth: Double, previewHeight: Double, slideBetweenAnimation: Boolean): TransformArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewPosition")(animatedValue.asInstanceOf[js.Any], previewWidth.asInstanceOf[js.Any], previewHeight.asInstanceOf[js.Any], slideBetweenAnimation.asInstanceOf[js.Any])).asInstanceOf[TransformArray]
  
  inline def getPreviewScale(animatedValue: Value, slideBetweenAnimation: Boolean): `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewScale")(animatedValue.asInstanceOf[js.Any], slideBetweenAnimation.asInstanceOf[js.Any])).asInstanceOf[`0`]
}
