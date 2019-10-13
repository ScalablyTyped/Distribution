package typings.atStorybookReactDashNative

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", JSImport.Namespace)
@js.native
object distPreviewComponentsOnDeviceUIAnimationMod extends js.Object {
  def getAddonPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Anon_Transform] = js.native
  def getNavigatorPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Anon_Transform] = js.native
  def getPreviewPosition(animatedValue: Value, previewWidth: Double, previewHeight: Double, slideBetweenAnimation: Boolean): Anon_TransformAnonTranslateXTranslateY = js.native
  def getPreviewScale(animatedValue: Value, slideBetweenAnimation: Boolean): Anon_TransformAnonScale = js.native
}

