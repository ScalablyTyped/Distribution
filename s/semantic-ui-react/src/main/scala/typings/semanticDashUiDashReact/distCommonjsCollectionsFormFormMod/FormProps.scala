package typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.equal
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends StrictFormProps
     with /* key */ StringDictionary[js.Any]

object FormProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    action: String = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    error: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onSubmit: (/* event */ FormEvent[HTMLFormElement], /* data */ FormProps) => Unit = null,
    reply: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined,
    widths: equal = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (action != null) __obj.updateDynamic("action")(action)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (!js.isUndefined(reply)) __obj.updateDynamic("reply")(reply)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[FormProps]
  }
}

