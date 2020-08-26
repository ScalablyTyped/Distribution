package typings.reactDropzone.mod

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.std.DataTransferItem
import typings.std.File
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.HTMLProps<std.HTMLElement>, react-dropzone.react-dropzone.PropTypes> & {  accept :string | std.Array<string> | undefined,   minSize :number | undefined,   maxSize :number | undefined,   preventDropOnDocument :boolean | undefined,   noClick :boolean | undefined,   noKeyboard :boolean | undefined,   noDrag :boolean | undefined,   noDragEventsBubbling :boolean | undefined,   disabled :boolean | undefined,   onDrop :<T extends std.File>(acceptedFiles : std.Array<T>, fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropAccepted :<T extends std.File>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropRejected :(fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   getFilesFromEvent :(event : react-dropzone.react-dropzone.DropEvent): std.Promise<std.Array<std.File | std.DataTransferItem>> | undefined,   onFileDialogCancel :(): void | undefined} */
@js.native
trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var getFilesFromEvent: js.UndefOr[
    js.Function1[/* event */ DropEvent, js.Promise[js.Array[File | DataTransferItem]]]
  ] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var noClick: js.UndefOr[Boolean] = js.native
  var noDrag: js.UndefOr[Boolean] = js.native
  var noDragEventsBubbling: js.UndefOr[Boolean] = js.native
  var noKeyboard: js.UndefOr[Boolean] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDrop: js.UndefOr[
    js.Function3[
      /* acceptedFiles */ js.Array[File], 
      /* fileRejections */ js.Array[FileRejection], 
      /* event */ DropEvent, 
      Unit
    ]
  ] = js.native
  var onDropAccepted: js.UndefOr[js.Function2[/* files */ js.Array[File], /* event */ DropEvent, Unit]] = js.native
  var onDropRejected: js.UndefOr[
    js.Function2[/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent, Unit]
  ] = js.native
  var onFileDialogCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var preventDropOnDocument: js.UndefOr[Boolean] = js.native
}

object DropzoneOptions {
  @scala.inline
  def apply(): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneOptions]
  }
  @scala.inline
  implicit class DropzoneOptionsOps[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    @scala.inline
    def setAccept(value: String | js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGetFilesFromEvent(value: /* event */ DropEvent => js.Promise[js.Array[File | DataTransferItem]]): Self = this.set("getFilesFromEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFilesFromEvent: Self = this.set("getFilesFromEvent", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setNoClick(value: Boolean): Self = this.set("noClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoClick: Self = this.set("noClick", js.undefined)
    @scala.inline
    def setNoDrag(value: Boolean): Self = this.set("noDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDrag: Self = this.set("noDrag", js.undefined)
    @scala.inline
    def setNoDragEventsBubbling(value: Boolean): Self = this.set("noDragEventsBubbling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDragEventsBubbling: Self = this.set("noDragEventsBubbling", js.undefined)
    @scala.inline
    def setNoKeyboard(value: Boolean): Self = this.set("noKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoKeyboard: Self = this.set("noKeyboard", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDrop(
      value: (/* acceptedFiles */ js.Array[File], /* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit
    ): Self = this.set("onDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDropAccepted(value: (/* files */ js.Array[File], /* event */ DropEvent) => Unit): Self = this.set("onDropAccepted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDropAccepted: Self = this.set("onDropAccepted", js.undefined)
    @scala.inline
    def setOnDropRejected(value: (/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit): Self = this.set("onDropRejected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDropRejected: Self = this.set("onDropRejected", js.undefined)
    @scala.inline
    def setOnFileDialogCancel(value: () => Unit): Self = this.set("onFileDialogCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFileDialogCancel: Self = this.set("onFileDialogCancel", js.undefined)
    @scala.inline
    def setPreventDropOnDocument(value: Boolean): Self = this.set("preventDropOnDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDropOnDocument: Self = this.set("preventDropOnDocument", js.undefined)
  }
  
}

