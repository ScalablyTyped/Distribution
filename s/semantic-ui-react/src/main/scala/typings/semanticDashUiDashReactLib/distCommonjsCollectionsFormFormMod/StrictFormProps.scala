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
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement], 
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

