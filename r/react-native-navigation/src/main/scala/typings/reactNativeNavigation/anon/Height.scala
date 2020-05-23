package typings.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /**
    * (Android only) component height
    */
  var height: js.UndefOr[Double] = js.undefined
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
  /**
    * (Android only) component width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    name: String,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    passProps: js.Object = null,
    width: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

