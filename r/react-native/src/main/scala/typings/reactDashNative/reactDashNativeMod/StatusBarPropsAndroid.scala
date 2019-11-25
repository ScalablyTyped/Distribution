package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarPropsAndroid extends js.Object {
  /**
    * The background color of the status bar.
    *
    * @platform android
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * If the status bar is translucent. When translucent is set to true,
    * the app will draw under the status bar. This is useful when using a
    * semi transparent status bar color.
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object StatusBarPropsAndroid {
  @scala.inline
  def apply(backgroundColor: String = null, translucent: js.UndefOr[Boolean] = js.undefined): StatusBarPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarPropsAndroid]
  }
}

