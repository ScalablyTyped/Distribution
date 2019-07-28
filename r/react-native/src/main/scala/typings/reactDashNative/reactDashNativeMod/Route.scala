package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route
  extends //anything else
/* key */ StringDictionary[js.Any] {
  //Commonly found properties
  var backButtonTitle: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ComponentType[_]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var onRightButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var passProps: js.UndefOr[js.Object] = js.undefined
  var rightButtonTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var wrapperStyle: js.UndefOr[js.Any] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    StringDictionary: //anything else
  /* key */ StringDictionary[js.Any] = null,
    backButtonTitle: String = null,
    component: ComponentType[_] = null,
    content: String = null,
    id: String = null,
    index: Int | Double = null,
    message: String = null,
    onRightButtonPress: () => Unit = null,
    passProps: js.Object = null,
    rightButtonTitle: String = null,
    title: String = null,
    wrapperStyle: js.Any = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (onRightButtonPress != null) __obj.updateDynamic("onRightButtonPress")(js.Any.fromFunction0(onRightButtonPress))
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    if (rightButtonTitle != null) __obj.updateDynamic("rightButtonTitle")(rightButtonTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[Route]
  }
}

