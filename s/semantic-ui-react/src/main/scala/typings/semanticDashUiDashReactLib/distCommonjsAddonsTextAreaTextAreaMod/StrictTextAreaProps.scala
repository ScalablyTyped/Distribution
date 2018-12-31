package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTextAreaProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Indicates whether height of the textarea fits the content or not. */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onInput: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Indicates row count for a TextArea. */
  var rows: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Custom TextArea style. */
  var style: js.UndefOr[js.Object] = js.undefined
  /** The value of the textarea. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

