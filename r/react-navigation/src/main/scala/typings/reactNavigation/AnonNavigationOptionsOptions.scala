package typings.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptionsOptions[Options] extends js.Object {
  var navigationOptions: Options
}

object AnonNavigationOptionsOptions {
  @scala.inline
  def apply[Options](navigationOptions: Options): AnonNavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptionsOptions[Options]]
  }
}

