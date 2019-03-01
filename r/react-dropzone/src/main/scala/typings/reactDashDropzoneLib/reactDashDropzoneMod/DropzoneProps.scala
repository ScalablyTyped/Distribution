package typings
package reactDashDropzoneLib.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in react-dropzone.PickedAttributes ]: react.react.InputHTMLAttributes<react.HTMLDivElement>[P]} */ trait DropzoneProps extends js.Object {
  var accept: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var acceptClassName: js.UndefOr[java.lang.String] = js.undefined
  var acceptStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var disableClick: js.UndefOr[scala.Boolean] = js.undefined
  var disablePreview: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledClassName: js.UndefOr[java.lang.String] = js.undefined
  var disabledStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputProps: js.UndefOr[reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement]] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var onDrop: js.UndefOr[DropFilesEventHandler] = js.undefined
  var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.undefined
  var onDropRejected: js.UndefOr[DropFileEventHandler] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined
  var rejectClassName: js.UndefOr[java.lang.String] = js.undefined
  var rejectStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object DropzoneProps {
  @scala.inline
  def apply(
    accept: java.lang.String | js.Array[java.lang.String] = null,
    acceptClassName: java.lang.String = null,
    acceptStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    activeClassName: java.lang.String = null,
    activeStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    disableClick: js.UndefOr[scala.Boolean] = js.undefined,
    disablePreview: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledClassName: java.lang.String = null,
    disabledStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inputProps: reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    onDrop: DropFilesEventHandler = null,
    onDropAccepted: DropFileEventHandler = null,
    onDropRejected: DropFileEventHandler = null,
    onFileDialogCancel: js.Function0[scala.Unit] = null,
    preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined,
    rejectClassName: java.lang.String = null,
    rejectStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): DropzoneProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptClassName != null) __obj.updateDynamic("acceptClassName")(acceptClassName)
    if (acceptStyle != null) __obj.updateDynamic("acceptStyle")(acceptStyle)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (!js.isUndefined(disableClick)) __obj.updateDynamic("disableClick")(disableClick)
    if (!js.isUndefined(disablePreview)) __obj.updateDynamic("disablePreview")(disablePreview)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(onDropAccepted)
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(onDropRejected)
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(onFileDialogCancel)
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument)
    if (rejectClassName != null) __obj.updateDynamic("rejectClassName")(rejectClassName)
    if (rejectStyle != null) __obj.updateDynamic("rejectStyle")(rejectStyle)
    __obj.asInstanceOf[DropzoneProps]
  }
}

