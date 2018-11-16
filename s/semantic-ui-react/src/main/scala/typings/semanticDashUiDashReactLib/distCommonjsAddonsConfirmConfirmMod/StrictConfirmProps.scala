package typings
package semanticDashUiDashReactLib.distCommonjsAddonsConfirmConfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictConfirmProps
  extends semanticDashUiDashReactLib.distCommonjsModulesModalModalMod.StrictModalProps {
  /** The cancel button text. */
  var cancelButton: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod.ButtonProps]
  ] = js.undefined
  /** The OK button text. */
  var confirmButton: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod.ButtonProps]
  ] = js.undefined
  /**
     * Called when the Modal is closed without clicking confirm.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onCancel: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ ConfirmProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the OK button is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onConfirm: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ ConfirmProps, 
      scala.Unit
    ]
  ] = js.undefined
}

