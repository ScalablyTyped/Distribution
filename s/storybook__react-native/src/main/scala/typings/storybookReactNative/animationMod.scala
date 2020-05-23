package typings.storybookReactNative

import typings.reactNative.mod.Animated.Value
import typings.storybookReactNative.anon.Transform
import typings.storybookReactNative.anon.TransformArray
import typings.storybookReactNative.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", JSImport.Namespace)
@js.native
object animationMod extends js.Object {
  def getAddonPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = js.native
  def getNavigatorPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = js.native
  def getPreviewPosition(animatedValue: Value, previewWidth: Double, previewHeight: Double, slideBetweenAnimation: Boolean): TransformArray = js.native
  def getPreviewScale(animatedValue: Value, slideBetweenAnimation: Boolean): `0` = js.native
}

