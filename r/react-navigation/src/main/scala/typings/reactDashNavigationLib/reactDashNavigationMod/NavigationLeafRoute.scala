package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationLeafRoute[Params] extends js.Object {
  /**
    * Index that represents the depth of the stack
    */
  var index: scala.Double
  /**
    * Flag that indicates the transition state of the route
    */
  var isTransitioning: scala.Boolean
  /**
    * React's key used by some navigators. No need to specify these manually,
    * they will be defined by the router.
    */
  var key: java.lang.String
  /**
    * Params passed to this route when navigating to it,
    * e.g. `{ car_id: 123 }` in a route that displays a car.
    */
  var params: js.UndefOr[Params] = js.undefined
  /**
    * Path is an advanced feature used for deep linking and on the web.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For example 'Home'.
    * This is used as a key in a route config when creating a navigator.
    */
  var routeName: java.lang.String
  /**
    * Array containing the navigator's routes
    */
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationLeafRoute {
  @scala.inline
  def apply[Params](
    index: scala.Double,
    isTransitioning: scala.Boolean,
    key: java.lang.String,
    routeName: java.lang.String,
    routes: js.Array[NavigationRoute[NavigationParams]],
    params: Params = null,
    path: java.lang.String = null
  ): NavigationLeafRoute[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isTransitioning")(isTransitioning)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("routeName")(routeName)
    __obj.updateDynamic("routes")(routes)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[NavigationLeafRoute[Params]]
  }
}

