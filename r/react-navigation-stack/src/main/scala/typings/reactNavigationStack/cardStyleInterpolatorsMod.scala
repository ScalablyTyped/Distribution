package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/TransitionConfigs/CardStyleInterpolators", JSImport.Namespace)
@js.native
object cardStyleInterpolatorsMod extends js.Object {
  def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  def forNoAnimation(): StackCardInterpolatedStyle = js.native
  def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
}

