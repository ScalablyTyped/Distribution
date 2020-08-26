package typings.reactNavigationDrawer.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationLeafRoute<react-navigation.react-navigation.NavigationParams> & react-navigation.react-navigation.NavigationState & {  isDrawerOpen :any | undefined} */
@js.native
trait NavigationLeafRouteNavigaIndex extends js.Object {
  /**
    * Index that represents the depth of the stack
    */
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double = js.native
  var isDrawerOpen: js.UndefOr[js.Any] = js.native
  /**
    * Flag that indicates the transition state of the route
    */
  var isTransitioning: Boolean = js.native
  /**
    * React's key used by some navigators. No need to specify these manually,
    * they will be defined by the router.
    */
  var key: String = js.native
  /**
    * Params passed to this route when navigating to it,
    * e.g. `{ car_id: 123 }` in a route that displays a car.
    */
  var params: js.UndefOr[NavigationParams] = js.native
  /**
    * Path is an advanced feature used for deep linking and on the web.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * For example 'Home'.
    * This is used as a key in a route config when creating a navigator.
    */
  var routeName: String = js.native
  /**
    * Array containing the navigator's routes
    */
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}

object NavigationLeafRouteNavigaIndex {
  @scala.inline
  def apply(
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationLeafRouteNavigaIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationLeafRouteNavigaIndex]
  }
  @scala.inline
  implicit class NavigationLeafRouteNavigaIndexOps[Self <: NavigationLeafRouteNavigaIndex] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTransitioning(value: Boolean): Self = this.set("isTransitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDrawerOpen(value: js.Any): Self = this.set("isDrawerOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDrawerOpen: Self = this.set("isDrawerOpen", js.undefined)
    @scala.inline
    def setParams(value: NavigationParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

