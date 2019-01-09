package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.StrictTextAreaProps because var conflicts: as. Inlined autoHeight, onChange, onInput, rows, style, value */ trait StrictFormTextAreaProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
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
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
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
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
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

