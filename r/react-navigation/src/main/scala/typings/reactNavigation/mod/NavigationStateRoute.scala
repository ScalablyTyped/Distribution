package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationLeafRoute<NavigationLeafRouteParams> & react-navigation.react-navigation.NavigationState */
trait NavigationStateRoute[NavigationLeafRouteParams] extends NavigationRoute[NavigationLeafRouteParams] {
  /**
    * Index that represents the depth of the stack
    */
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double
  /**
    * Flag that indicates the transition state of the route
    */
  var isTransitioning: Boolean
  /**
    * React's key used by some navigators. No need to specify these manually,
    * they will be defined by the router.
    */
  var key: String
  /**
    * Params passed to this route when navigating to it,
    * e.g. `{ car_id: 123 }` in a route that displays a car.
    */
  var params: js.UndefOr[NavigationLeafRouteParams with js.UndefOr[NavigationParams]] = js.undefined
  /**
    * Path is an advanced feature used for deep linking and on the web.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * For example 'Home'.
    * This is used as a key in a route config when creating a navigator.
    */
  var routeName: String
  /**
    * Array containing the navigator's routes
    */
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationStateRoute {
  @scala.inline
  def apply[NavigationLeafRouteParams](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]],
    params: NavigationLeafRouteParams with js.UndefOr[NavigationParams] = null,
    path: String = null
  ): NavigationStateRoute[NavigationLeafRouteParams] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStateRoute[NavigationLeafRouteParams]]
  }
}

