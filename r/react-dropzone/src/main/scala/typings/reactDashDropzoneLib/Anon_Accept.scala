package typings
package reactDashDropzoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var getFilesFromEvent: js.UndefOr[
    js.Function1[
      /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent, 
      js.Promise[js.Array[stdLib.File | stdLib.DataTransferItem]]
    ]
  ] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var noClick: js.UndefOr[scala.Boolean] = js.undefined
  var noDrag: js.UndefOr[scala.Boolean] = js.undefined
  var noDragEventsBubbling: js.UndefOr[scala.Boolean] = js.undefined
  var noKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var onDrop: js.UndefOr[
    js.Function3[
      /* acceptedFiles */ js.Array[stdLib.File], 
      /* rejectedFiles */ js.Array[stdLib.File], 
      /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onDropAccepted: js.UndefOr[
    js.Function2[
      /* files */ js.Array[stdLib.File], 
      /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onDropRejected: js.UndefOr[
    js.Function2[
      /* files */ js.Array[stdLib.File], 
      /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(
    accept: java.lang.String | js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    getFilesFromEvent: /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent => js.Promise[js.Array[stdLib.File | stdLib.DataTransferItem]] = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    noClick: js.UndefOr[scala.Boolean] = js.undefined,
    noDrag: js.UndefOr[scala.Boolean] = js.undefined,
    noDragEventsBubbling: js.UndefOr[scala.Boolean] = js.undefined,
    noKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    onDrop: (/* acceptedFiles */ js.Array[stdLib.File], /* rejectedFiles */ js.Array[stdLib.File], /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent) => scala.Unit = null,
    onDropAccepted: (/* files */ js.Array[stdLib.File], /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent) => scala.Unit = null,
    onDropRejected: (/* files */ js.Array[stdLib.File], /* event */ reactDashDropzoneLib.reactDashDropzoneMod.DropEvent) => scala.Unit = null,
    onFileDialogCancel: () => scala.Unit = null,
    preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined
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

