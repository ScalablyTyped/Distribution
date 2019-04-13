package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFormProps extends js.Object {
  /** The HTML form action */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Automatically show any error Message children. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** A form can have its color inverted for contrast. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Automatically show a loading indicator. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** The HTML form submit handler. */
  var onSubmit: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.FormEvent[stdLib.HTMLFormElement], 
      /* data */ FormProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A comment can contain a form to reply to a comment. This may have arbitrary content. */
  var reply: js.UndefOr[scala.Boolean] = js.undefined
  /** A form can vary in size. */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Automatically show any success Message children. */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** A form can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[scala.Boolean] = js.undefined
  /** Automatically show any warning Message children. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
  /** Forms can automatically divide fields to be equal width. */
  var widths: js.UndefOr[semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal] = js.undefined
}

object StrictFormProps {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onSubmit: (/* event */ reactLib.reactMod.FormEvent[stdLib.HTMLFormElement], /* data */ FormProps) => scala.Unit = null,
    reply: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    unstackable: js.UndefOr[scala.Boolean] = js.undefined,
    warning: js.UndefOr[scala.Boolean] = js.undefined,
    widths: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null
  ): StrictFormProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictFormProps]
  }
}

