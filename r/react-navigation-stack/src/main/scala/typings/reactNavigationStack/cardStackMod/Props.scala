package typings.reactNavigationStack.cardStackMod

import typings.react.mod.ReactNode
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  var closingRouteKeys: js.Array[String] = js.native
  var descriptors: StackDescriptorMap = js.native
  var headerMode: StackHeaderMode = js.native
  var insets: EdgeInsets = js.native
  var mode: StackCardMode = js.native
  var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onPageChangeConfirm: js.UndefOr[js.Function0[Unit]] = js.native
  var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var openingRouteKeys: js.Array[String] = js.native
  var routes: js.Array[Route[String]] = js.native
  var state: NavigationState = js.native
  def getGesturesEnabled(props: typings.reactNavigationStack.anon.Route): Boolean = js.native
  def getPreviousRoute(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Route[String]] = js.native
  def onCloseRoute(props: typings.reactNavigationStack.anon.Route): Unit = js.native
  def onOpenRoute(props: typings.reactNavigationStack.anon.Route): Unit = js.native
  def onTransitionEnd(props: typings.reactNavigationStack.anon.Route, closing: Boolean): Unit = js.native
  def onTransitionStart(props: typings.reactNavigationStack.anon.Route, closing: Boolean): Unit = js.native
  def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode = js.native
  def renderScene(props: typings.reactNavigationStack.anon.Route): ReactNode = js.native
}

object Props {
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    getGesturesEnabled: typings.reactNavigationStack.anon.Route => Boolean,
    getPreviousRoute: typings.reactNavigationStack.anon.Route => js.UndefOr[Route[String]],
    headerMode: StackHeaderMode,
    insets: EdgeInsets,
    mode: StackCardMode,
    onCloseRoute: typings.reactNavigationStack.anon.Route => Unit,
    onOpenRoute: typings.reactNavigationStack.anon.Route => Unit,
    onTransitionEnd: (typings.reactNavigationStack.anon.Route, Boolean) => Unit,
    onTransitionStart: (typings.reactNavigationStack.anon.Route, Boolean) => Unit,
    openingRouteKeys: js.Array[String],
    renderHeader: typings.reactNavigationStack.headerContainerMod.Props => ReactNode,
    renderScene: typings.reactNavigationStack.anon.Route => ReactNode,
    routes: js.Array[Route[String]],
    state: NavigationState
  ): Props = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionEnd = js.Any.fromFunction2(onTransitionEnd), onTransitionStart = js.Any.fromFunction2(onTransitionStart), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClosingRouteKeysVarargs(value: String*): Self = this.set("closingRouteKeys", js.Array(value :_*))
    @scala.inline
    def setClosingRouteKeys(value: js.Array[String]): Self = this.set("closingRouteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGesturesEnabled(value: typings.reactNavigationStack.anon.Route => Boolean): Self = this.set("getGesturesEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPreviousRoute(value: typings.reactNavigationStack.anon.Route => js.UndefOr[Route[String]]): Self = this.set("getPreviousRoute", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsets(value: EdgeInsets): Self = this.set("insets", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCloseRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onCloseRoute", js.Any.fromFunction1(value))
    @scala.inline
    def setOnOpenRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onOpenRoute", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTransitionEnd(value: (typings.reactNavigationStack.anon.Route, Boolean) => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setOnTransitionStart(value: (typings.reactNavigationStack.anon.Route, Boolean) => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction2(value))
    @scala.inline
    def setOpeningRouteKeysVarargs(value: String*): Self = this.set("openingRouteKeys", js.Array(value :_*))
    @scala.inline
    def setOpeningRouteKeys(value: js.Array[String]): Self = this.set("openingRouteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderHeader(value: typings.reactNavigationStack.headerContainerMod.Props => ReactNode): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderScene(value: typings.reactNavigationStack.anon.Route => ReactNode): Self = this.set("renderScene", js.Any.fromFunction1(value))
    @scala.inline
    def setRoutesVarargs(value: Route[String]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Route[String]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: NavigationState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPageChangeCancel(value: () => Unit): Self = this.set("onPageChangeCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPageChangeCancel: Self = this.set("onPageChangeCancel", js.undefined)
    @scala.inline
    def setOnPageChangeConfirm(value: () => Unit): Self = this.set("onPageChangeConfirm", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPageChangeConfirm: Self = this.set("onPageChangeConfirm", js.undefined)
    @scala.inline
    def setOnPageChangeStart(value: () => Unit): Self = this.set("onPageChangeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPageChangeStart: Self = this.set("onPageChangeStart", js.undefined)
  }
  
}

