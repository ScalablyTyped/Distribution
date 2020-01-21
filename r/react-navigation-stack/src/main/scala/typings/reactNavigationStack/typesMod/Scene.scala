package typings.reactNavigationStack.typesMod

import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var descriptor: NavigationDescriptor[
    NavigationParams, 
    NavigationStackOptions, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ]
  var index: Double
  var isActive: Boolean
  var isStale: Boolean
  var key: String
  var route: NavigationRoute[NavigationParams]
}

object Scene {
  @scala.inline
  def apply(
    descriptor: NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ],
    index: Double,
    isActive: Boolean,
    isStale: Boolean,
    key: String,
    route: NavigationRoute[NavigationParams]
  ): Scene = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

