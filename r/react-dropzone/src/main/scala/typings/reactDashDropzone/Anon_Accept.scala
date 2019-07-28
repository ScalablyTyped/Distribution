package typings.reactDashDropzone

import typings.reactDashDropzone.reactDashDropzoneMod.DropEvent
import typings.std.DataTransferItem
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var getFilesFromEvent: js.UndefOr[
    js.Function1[/* event */ DropEvent, js.Promise[js.Array[File | DataTransferItem]]]
  ] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var noClick: js.UndefOr[Boolean] = js.undefined
  var noDrag: js.UndefOr[Boolean] = js.undefined
  var noDragEventsBubbling: js.UndefOr[Boolean] = js.undefined
  var noKeyboard: js.UndefOr[Boolean] = js.undefined
  var onDrop: js.UndefOr[
    js.Function3[
      /* acceptedFiles */ js.Array[File], 
      /* rejectedFiles */ js.Array[File], 
      /* event */ DropEvent, 
      Unit
    ]
  ] = js.undefined
  var onDropAccepted: js.UndefOr[js.Function2[/* files */ js.Array[File], /* event */ DropEvent, Unit]] = js.undefined
  var onDropRejected: js.UndefOr[js.Function2[/* files */ js.Array[File], /* event */ DropEvent, Unit]] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
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
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Anon_Accept]
  }
}

