package typings.reactDashJsonDashPretty.reactDashJsonDashPrettyMod

import typings.react.reactMod.HTMLAttributes
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends HTMLAttributes[HTMLElement] {
  var booleanStyle: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var errorStyle: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var keyStyle: js.UndefOr[String] = js.undefined
  var mainStyle: js.UndefOr[String] = js.undefined
  var onJSONPrettyError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _ | Null]] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var space: js.UndefOr[Double | String] = js.undefined
  var stringStyle: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var themeClassName: js.UndefOr[String] = js.undefined
  var valueStyle: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    booleanStyle: String = null,
    data: js.Any = null,
    errorStyle: String = null,
    json: js.Any = null,
    keyStyle: String = null,
    mainStyle: String = null,
    onJSONPrettyError: /* e */ Error => Unit = null,
    replacer: (/* key */ String, /* value */ js.Any) => _ | Null = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    space: Double | String = null,
    stringStyle: String = null,
    theme: ITheme = null,
    themeClassName: String = null,
    valueStyle: String = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (booleanStyle != null) __obj.updateDynamic("booleanStyle")(booleanStyle)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (json != null) __obj.updateDynamic("json")(json)
    if (keyStyle != null) __obj.updateDynamic("keyStyle")(keyStyle)
    if (mainStyle != null) __obj.updateDynamic("mainStyle")(mainStyle)
    if (onJSONPrettyError != null) __obj.updateDynamic("onJSONPrettyError")(js.Any.fromFunction1(onJSONPrettyError))
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2(replacer))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (stringStyle != null) __obj.updateDynamic("stringStyle")(stringStyle)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (themeClassName != null) __obj.updateDynamic("themeClassName")(themeClassName)
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    __obj.asInstanceOf[IProps]
  }
}

