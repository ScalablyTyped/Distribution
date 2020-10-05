package typings.reactNavigationDrawer.typesMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.NavigationState & {  isDrawerOpen :boolean} */
@js.native
trait NavigationDrawerState extends js.Object {
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double = js.native
  var isDrawerOpen: Boolean = js.native
  var isTransitioning: Boolean = js.native
  var key: String = js.native
  var params: js.UndefOr[NavigationParams] = js.native
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}

object NavigationDrawerState {
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationDrawerState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerState]
  }
  @scala.inline
  implicit class NavigationDrawerStateOps[Self <: NavigationDrawerState] (val x: Self) extends AnyVal {
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
    def setIsDrawerOpen(value: Boolean): Self = this.set("isDrawerOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTransitioning(value: Boolean): Self = this.set("isTransitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: NavigationParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

