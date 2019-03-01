package typings
package reactDashNativeDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alignment extends js.Object {
  /**
    * Set component alignment
    */
  var alignment: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.center | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.fill
  ] = js.undefined
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of your component
    */
  var name: java.lang.String
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object Anon_Alignment {
  @scala.inline
  def apply(
    name: java.lang.String,
    alignment: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.center | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.fill = null,
    id: java.lang.String = null,
    passProps: js.Object = null
  ): Anon_Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[Anon_Alignment]
  }
}

