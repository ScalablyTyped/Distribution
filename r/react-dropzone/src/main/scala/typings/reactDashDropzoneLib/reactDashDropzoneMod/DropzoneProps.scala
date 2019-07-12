package typings
package reactDashDropzoneLib.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in react-dropzone.react-dropzone.PropTypes ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait DropzoneProps
  extends reactDashDropzoneLib.Anon_Accept {
  var children: js.UndefOr[js.Function1[/* state */ DropzoneState, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
}

object DropzoneProps {
  @scala.inline
  def apply(
    accept: java.lang.String | js.Array[java.lang.String] = null,
    children: /* state */ DropzoneState => reactLib.reactMod.Global.JSXNs.Element = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    getFilesFromEvent: /* event */ DropEvent => js.Promise[js.Array[stdLib.File | stdLib.DataTransferItem]] = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    noClick: js.UndefOr[scala.Boolean] = js.undefined,
    noDrag: js.UndefOr[scala.Boolean] = js.undefined,
    noDragEventsBubbling: js.UndefOr[scala.Boolean] = js.undefined,
    noKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    onDrop: (/* acceptedFiles */ js.Array[stdLib.File], /* rejectedFiles */ js.Array[stdLib.File], /* event */ DropEvent) => scala.Unit = null,
    onDropAccepted: (/* files */ js.Array[stdLib.File], /* event */ DropEvent) => scala.Unit = null,
    onDropRejected: (/* files */ js.Array[stdLib.File], /* event */ DropEvent) => scala.Unit = null,
    onFileDialogCancel: () => scala.Unit = null,
    preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined
  ): DropzoneProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (getFilesFromEvent != null) __obj.updateDynamic("getFilesFromEvent")(js.Any.fromFunction1(getFilesFromEvent))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(noClick)) __obj.updateDynamic("noClick")(noClick)
    if (!js.isUndefined(noDrag)) __obj.updateDynamic("noDrag")(noDrag)
    if (!js.isUndefined(noDragEventsBubbling)) __obj.updateDynamic("noDragEventsBubbling")(noDragEventsBubbling)
    if (!js.isUndefined(noKeyboard)) __obj.updateDynamic("noKeyboard")(noKeyboard)
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument)
    __obj.asInstanceOf[DropzoneProps]
  }
}

