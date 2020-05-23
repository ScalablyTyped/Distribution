package typings.reactNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptionsOptions[Options] extends js.Object {
  var navigationOptions: Options
}

object NavigationOptionsOptions {
  @scala.inline
  def apply[Options](navigationOptions: Options): NavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptionsOptions[Options]]
  }
}

