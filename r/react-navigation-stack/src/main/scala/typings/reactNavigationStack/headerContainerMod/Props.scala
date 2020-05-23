package typings.reactNavigationStack.headerContainerMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Height
import typings.reactNavigationStack.reactNavigationStackStrings.float
import typings.reactNavigationStack.reactNavigationStackStrings.screen
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var gestureDirection: GestureDirection
  var insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any
  var layout: Layout
  var mode: float | screen
  var onContentHeightChange: js.UndefOr[js.Function1[/* props */ Height, Unit]] = js.undefined
  var scenes: js.Array[js.UndefOr[Scene[Route[String]]]]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styleInterpolator: StackHeaderStyleInterpolator
  def getFocusedRoute(): Route[String]
  def getPreviousRoute(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Route[String]]
}

object Props {
  @scala.inline
  def apply(
    gestureDirection: GestureDirection,
    getFocusedRoute: () => Route[String],
    getPreviousRoute: typings.reactNavigationStack.anon.Route => js.UndefOr[Route[String]],
    insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any,
    layout: Layout,
    mode: float | screen,
    scenes: js.Array[js.UndefOr[Scene[Route[String]]]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    onContentHeightChange: /* props */ Height => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

