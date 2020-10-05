package typings.reactNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptionsOptions[Options] extends js.Object {
  var navigationOptions: Options = js.native
}

object NavigationOptionsOptions {
  @scala.inline
  def apply[Options](navigationOptions: Options): NavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptionsOptions[Options]]
  }
  @scala.inline
  implicit class NavigationOptionsOptionsOps[Self <: NavigationOptionsOptions[_], Options] (val x: Self with NavigationOptionsOptions[Options]) extends AnyVal {
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
    def setNavigationOptions(value: Options): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
  }
  
}

