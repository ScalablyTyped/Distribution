package typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod

import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalComponent extends js.Object {
  /**
    * Set the screen's id so Navigation.mergeOptions can be used to update options
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Name of your component
    */
  var name: String | Double
  /**
    * Configure component options
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object ExternalComponent {
  @scala.inline
  def apply(name: String | Double, id: String = null, options: Options = null, passProps: js.Object = null): ExternalComponent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[ExternalComponent]
  }
}

