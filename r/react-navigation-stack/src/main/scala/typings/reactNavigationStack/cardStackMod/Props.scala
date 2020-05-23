package typings.reactNavigationStack.cardStackMod

import typings.react.mod.ReactNode
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var closingRouteKeys: js.Array[String]
  var descriptors: StackDescriptorMap
  var headerMode: StackHeaderMode
  var insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any
  var mode: StackCardMode
  var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openingRouteKeys: js.Array[String]
  var routes: js.Array[Route[String]]
  var state: NavigationState
  def getGesturesEnabled(props: typings.reactNavigationStack.anon.Route): Boolean
  def getPreviousRoute(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Route[String]]
  def onCloseRoute(props: typings.reactNavigationStack.anon.Route): Unit
  def onOpenRoute(props: typings.reactNavigationStack.anon.Route): Unit
  def onTransitionEnd(props: typings.reactNavigationStack.anon.Route, closing: Boolean): Unit
  def onTransitionStart(props: typings.reactNavigationStack.anon.Route, closing: Boolean): Unit
  def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode
  def renderScene(props: typings.reactNavigationStack.anon.Route): ReactNode
}

object Props {
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    getGesturesEnabled: typings.reactNavigationStack.anon.Route => Boolean,
    getPreviousRoute: typings.reactNavigationStack.anon.Route => js.UndefOr[Route[String]],
    headerMode: StackHeaderMode,
    insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any,
    mode: StackCardMode,
    onCloseRoute: typings.reactNavigationStack.anon.Route => Unit,
    onOpenRoute: typings.reactNavigationStack.anon.Route => Unit,
    onTransitionEnd: (typings.reactNavigationStack.anon.Route, Boolean) => Unit,
    onTransitionStart: (typings.reactNavigationStack.anon.Route, Boolean) => Unit,
    openingRouteKeys: js.Array[String],
    renderHeader: typings.reactNavigationStack.headerContainerMod.Props => ReactNode,
    renderScene: typings.reactNavigationStack.anon.Route => ReactNode,
    routes: js.Array[Route[String]],
    state: NavigationState,
    onPageChangeCancel: () => Unit = null,
    onPageChangeConfirm: () => Unit = null,
    onPageChangeStart: () => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionEnd = js.Any.fromFunction2(onTransitionEnd), onTransitionStart = js.Any.fromFunction2(onTransitionStart), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (onPageChangeCancel != null) __obj.updateDynamic("onPageChangeCancel")(js.Any.fromFunction0(onPageChangeCancel))
    if (onPageChangeConfirm != null) __obj.updateDynamic("onPageChangeConfirm")(js.Any.fromFunction0(onPageChangeConfirm))
    if (onPageChangeStart != null) __obj.updateDynamic("onPageChangeStart")(js.Any.fromFunction0(onPageChangeStart))
    __obj.asInstanceOf[Props]
  }
}

