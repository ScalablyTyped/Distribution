package typings.reactDropzone

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChangeEvent
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactDropzone.reactDropzoneStrings.`file-invalid-type`
import typings.reactDropzone.reactDropzoneStrings.`file-too-large`
import typings.reactDropzone.reactDropzoneStrings.`file-too-small`
import typings.reactDropzone.reactDropzoneStrings.`too-many-files`
import typings.std.DataTransferItem
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dropzone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: DropzoneProps & RefAttributes[DropzoneRef]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def useDropzone(): DropzoneState = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")().asInstanceOf[DropzoneState]
  @scala.inline
  def useDropzone(options: DropzoneOptions): DropzoneState = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")(options.asInstanceOf[js.Any]).asInstanceOf[DropzoneState]
  
  type DropEvent = DragEvent[HTMLElement] | ChangeEvent[HTMLInputElement] | typings.std.DragEvent | Event
  
  trait DropzoneInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var refKey: js.UndefOr[String] = js.undefined
  }
  object DropzoneInputProps {
    
    @scala.inline
    def apply(): DropzoneInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneInputProps]
    }
    
    @scala.inline
    implicit class DropzoneInputPropsMutableBuilder[Self <: DropzoneInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLProps<std.HTMLElement>, react-dropzone.react-dropzone.PropTypes> & {  accept :string | std.Array<string> | undefined,   minSize :number | undefined,   maxSize :number | undefined,   maxFiles :number | undefined,   preventDropOnDocument :boolean | undefined,   noClick :boolean | undefined,   noKeyboard :boolean | undefined,   noDrag :boolean | undefined,   noDragEventsBubbling :boolean | undefined,   disabled :boolean | undefined,   onDrop :<T extends std.File>(acceptedFiles : std.Array<T>, fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropAccepted :<T extends std.File>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropRejected :(fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   getFilesFromEvent :(event : react-dropzone.react-dropzone.DropEvent): std.Promise<std.Array<std.File | std.DataTransferItem>> | undefined,   onFileDialogCancel :(): void | undefined} */
  trait DropzoneOptions extends StObject {
    
    var accept: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var getFilesFromEvent: js.UndefOr[
        js.Function1[/* event */ DropEvent, js.Promise[js.Array[File | DataTransferItem]]]
      ] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var noClick: js.UndefOr[Boolean] = js.undefined
    
    var noDrag: js.UndefOr[Boolean] = js.undefined
    
    var noDragEventsBubbling: js.UndefOr[Boolean] = js.undefined
    
    var noKeyboard: js.UndefOr[Boolean] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDrop: js.UndefOr[
        js.Function3[
          /* acceptedFiles */ js.Array[File], 
          /* fileRejections */ js.Array[FileRejection], 
          /* event */ DropEvent, 
          Unit
        ]
      ] = js.undefined
    
    var onDropAccepted: js.UndefOr[js.Function2[/* files */ js.Array[File], /* event */ DropEvent, Unit]] = js.undefined
    
    var onDropRejected: js.UndefOr[
        js.Function2[/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent, Unit]
      ] = js.undefined
    
    var onFileDialogCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
  }
  object DropzoneOptions {
    
    @scala.inline
    def apply(): DropzoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneOptions]
    }
    
    @scala.inline
    implicit class DropzoneOptionsMutableBuilder[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGetFilesFromEvent(value: /* event */ DropEvent => js.Promise[js.Array[File | DataTransferItem]]): Self = StObject.set(x, "getFilesFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilesFromEventUndefined: Self = StObject.set(x, "getFilesFromEvent", js.undefined)
      
      @scala.inline
      def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNoClick(value: Boolean): Self = StObject.set(x, "noClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoClickUndefined: Self = StObject.set(x, "noClick", js.undefined)
      
      @scala.inline
      def setNoDrag(value: Boolean): Self = StObject.set(x, "noDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDragEventsBubbling(value: Boolean): Self = StObject.set(x, "noDragEventsBubbling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDragEventsBubblingUndefined: Self = StObject.set(x, "noDragEventsBubbling", js.undefined)
      
      @scala.inline
      def setNoDragUndefined: Self = StObject.set(x, "noDrag", js.undefined)
      
      @scala.inline
      def setNoKeyboard(value: Boolean): Self = StObject.set(x, "noKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoKeyboardUndefined: Self = StObject.set(x, "noKeyboard", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDrop(
        value: (/* acceptedFiles */ js.Array[File], /* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDropAccepted(value: (/* files */ js.Array[File], /* event */ DropEvent) => Unit): Self = StObject.set(x, "onDropAccepted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropAcceptedUndefined: Self = StObject.set(x, "onDropAccepted", js.undefined)
      
      @scala.inline
      def setOnDropRejected(value: (/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit): Self = StObject.set(x, "onDropRejected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropRejectedUndefined: Self = StObject.set(x, "onDropRejected", js.undefined)
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnFileDialogCancel(value: () => Unit): Self = StObject.set(x, "onFileDialogCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFileDialogCancelUndefined: Self = StObject.set(x, "onFileDialogCancel", js.undefined)
      
      @scala.inline
      def setPreventDropOnDocument(value: Boolean): Self = StObject.set(x, "preventDropOnDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDropOnDocumentUndefined: Self = StObject.set(x, "preventDropOnDocument", js.undefined)
    }
  }
  
  trait DropzoneProps
    extends StObject
       with DropzoneOptions {
    
    var children: js.UndefOr[js.Function1[/* state */ DropzoneState, Element]] = js.undefined
  }
  object DropzoneProps {
    
    @scala.inline
    def apply(): DropzoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneProps]
    }
    
    @scala.inline
    implicit class DropzonePropsMutableBuilder[Self <: DropzoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* state */ DropzoneState => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait DropzoneRef extends StObject {
    
    def open(): Unit
  }
  object DropzoneRef {
    
    @scala.inline
    def apply(open: () => Unit): DropzoneRef = {
      val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[DropzoneRef]
    }
    
    @scala.inline
    implicit class DropzoneRefMutableBuilder[Self <: DropzoneRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  trait DropzoneRootProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var refKey: js.UndefOr[String] = js.undefined
  }
  object DropzoneRootProps {
    
    @scala.inline
    def apply(): DropzoneRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneRootProps]
    }
    
    @scala.inline
    implicit class DropzoneRootPropsMutableBuilder[Self <: DropzoneRootProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    }
  }
  
  @js.native
  trait DropzoneState
    extends StObject
       with DropzoneRef {
    
    var acceptedFiles: js.Array[File] = js.native
    
    var draggedFiles: js.Array[File] = js.native
    
    var fileRejections: js.Array[FileRejection] = js.native
    
    def getInputProps(): DropzoneInputProps = js.native
    def getInputProps(props: DropzoneInputProps): DropzoneInputProps = js.native
    
    def getRootProps(): DropzoneRootProps = js.native
    def getRootProps(props: DropzoneRootProps): DropzoneRootProps = js.native
    
    var inputRef: RefObject[HTMLInputElement] = js.native
    
    var isDragAccept: Boolean = js.native
    
    var isDragActive: Boolean = js.native
    
    var isDragReject: Boolean = js.native
    
    var isFileDialogActive: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var rootRef: RefObject[HTMLElement] = js.native
  }
  
  trait FileError extends StObject {
    
    var code: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type`
    
    var message: String
  }
  object FileError {
    
    @scala.inline
    def apply(
      code: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type`,
      message: String
    ): FileError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileError]
    }
    
    @scala.inline
    implicit class FileErrorMutableBuilder[Self <: FileError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileRejection extends StObject {
    
    var errors: js.Array[FileError]
    
    var file: File
  }
  object FileRejection {
    
    @scala.inline
    def apply(errors: js.Array[FileError], file: File): FileRejection = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRejection]
    }
    
    @scala.inline
    implicit class FileRejectionMutableBuilder[Self <: FileRejection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[FileError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: FileError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDropzone.reactDropzoneStrings.multiple
    - typings.reactDropzone.reactDropzoneStrings.onDragEnter
    - typings.reactDropzone.reactDropzoneStrings.onDragOver
    - typings.reactDropzone.reactDropzoneStrings.onDragLeave
  */
  trait PropTypes extends StObject
  object PropTypes {
    
    @scala.inline
    def multiple: typings.reactDropzone.reactDropzoneStrings.multiple = "multiple".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.multiple]
    
    @scala.inline
    def onDragEnter: typings.reactDropzone.reactDropzoneStrings.onDragEnter = "onDragEnter".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragEnter]
    
    @scala.inline
    def onDragLeave: typings.reactDropzone.reactDropzoneStrings.onDragLeave = "onDragLeave".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragLeave]
    
    @scala.inline
    def onDragOver: typings.reactDropzone.reactDropzoneStrings.onDragOver = "onDragOver".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragOver]
  }
}
