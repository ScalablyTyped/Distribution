package typings.reactDashDropzone.reactDashDropzoneMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashDropzone.Anon_Accept
import typings.std.DataTransferItem
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in react-dropzone.react-dropzone.PropTypes ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait DropzoneProps extends Anon_Accept {
  var children: js.UndefOr[js.Function1[/* state */ DropzoneState, Element]] = js.undefined
}

object DropzoneProps {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
    children: /* state */ DropzoneState => Element = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getFilesFromEvent: /* event */ DropEvent => js.Promise[js.Array[File | DataTransferItem]] = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    noClick: js.UndefOr[Boolean] = js.undefined,
    noDrag: js.UndefOr[Boolean] = js.undefined,
    noDragEventsBubbling: js.UndefOr[Boolean] = js.undefined,
    noKeyboard: js.UndefOr[Boolean] = js.undefined,
    onDrop: (/* acceptedFiles */ js.Array[File], /* rejectedFiles */ js.Array[File], /* event */ DropEvent) => Unit = null,
    onDropAccepted: (/* files */ js.Array[File], /* event */ DropEvent) => Unit = null,
    onDropRejected: (/* files */ js.Array[File], /* event */ DropEvent) => Unit = null,
    onFileDialogCancel: () => Unit = null,
    preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
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

