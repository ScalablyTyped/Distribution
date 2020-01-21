package typings.reactNativeNavigation

import typings.reactNativeNavigation.reactNativeNavigationStrings.center
import typings.reactNativeNavigation.reactNativeNavigationStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignment extends js.Object {
  /**
    * Set component alignment
    */
  var alignment: js.UndefOr[center | fill] = js.undefined
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Name of your component
    */
  var name: String
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object AnonAlignment {
  @scala.inline
  def apply(name: String, alignment: center | fill = null, id: String = null, passProps: js.Object = null): AnonAlignment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignment]
  }
}

