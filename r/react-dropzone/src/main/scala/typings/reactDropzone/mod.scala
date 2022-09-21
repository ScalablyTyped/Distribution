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
  
  inline def default(props: DropzoneProps & RefAttributes[DropzoneRef]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("react-dropzone", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCode & String] = js.native
    
    @js.native
    sealed trait FileInvalidType
      extends StObject
         with ErrorCode
    /* "file-invalid-type" */ val FileInvalidType: typings.reactDropzone.mod.ErrorCode.FileInvalidType & String = js.native
    
    @js.native
    sealed trait FileTooLarge
      extends StObject
         with ErrorCode
    /* "file-too-large" */ val FileTooLarge: typings.reactDropzone.mod.ErrorCode.FileTooLarge & String = js.native
    
    @js.native
    sealed trait FileTooSmall
      extends StObject
         with ErrorCode
    /* "file-too-small" */ val FileTooSmall: typings.reactDropzone.mod.ErrorCode.FileTooSmall & String = js.native
    
    @js.native
    sealed trait TooManyFiles
      extends StObject
         with ErrorCode
    /* "too-many-files" */ val TooManyFiles: typings.reactDropzone.mod.ErrorCode.TooManyFiles & String = js.native
  }
  
  inline def useDropzone(): DropzoneState = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")().asInstanceOf[DropzoneState]
  inline def useDropzone(options: DropzoneOptions): DropzoneState = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")(options.asInstanceOf[js.Any]).asInstanceOf[DropzoneState]
  
  type Accept = StringDictionary[js.Array[String]]
  
  type DropEvent = DragEvent[HTMLElement] | ChangeEvent[HTMLInputElement] | typings.std.DragEvent | Event
  
  trait DropzoneInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var refKey: js.UndefOr[String] = js.undefined
  }
  object DropzoneInputProps {
    
    inline def apply(): DropzoneInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneInputProps]
    }
    
    extension [Self <: DropzoneInputProps](x: Self) {
      
      inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLProps<std.HTMLElement>, react-dropzone.react-dropzone.PropTypes> & {  accept :react-dropzone.react-dropzone.Accept | undefined,   minSize :number | undefined,   maxSize :number | undefined,   maxFiles :number | undefined,   preventDropOnDocument :boolean | undefined,   noClick :boolean | undefined,   noKeyboard :boolean | undefined,   noDrag :boolean | undefined,   noDragEventsBubbling :boolean | undefined,   disabled :boolean | undefined,   onDrop :<T extends std.File>(acceptedFiles : std.Array<T>, fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropAccepted :<T extends std.File>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropRejected :(fileRejections : std.Array<react-dropzone.react-dropzone.FileRejection>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   getFilesFromEvent :(event : react-dropzone.react-dropzone.DropEvent): std.Promise<std.Array<std.File | std.DataTransferItem>> | undefined,   onFileDialogCancel :(): void | undefined,   onFileDialogOpen :(): void | undefined,   onError :(err : std.Error): void | undefined,   validator :<T extends std.File>(file : T): react-dropzone.react-dropzone.FileError | std.Array<react-dropzone.react-dropzone.FileError> | null | undefined,   useFsAccessApi :boolean | undefined,   autoFocus :boolean | undefined} */
  trait DropzoneOptions extends StObject {
    
    var accept: js.UndefOr[Accept] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
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
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var onFileDialogCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFileDialogOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
    
    var useFsAccessApi: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function1[/* file */ File, FileError | js.Array[FileError] | Null]] = js.undefined
  }
  object DropzoneOptions {
    
    inline def apply(): DropzoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneOptions]
    }
    
    extension [Self <: DropzoneOptions](x: Self) {
      
      inline def setAccept(value: Accept): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGetFilesFromEvent(value: /* event */ DropEvent => js.Promise[js.Array[File | DataTransferItem]]): Self = StObject.set(x, "getFilesFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetFilesFromEventUndefined: Self = StObject.set(x, "getFilesFromEvent", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoClick(value: Boolean): Self = StObject.set(x, "noClick", value.asInstanceOf[js.Any])
      
      inline def setNoClickUndefined: Self = StObject.set(x, "noClick", js.undefined)
      
      inline def setNoDrag(value: Boolean): Self = StObject.set(x, "noDrag", value.asInstanceOf[js.Any])
      
      inline def setNoDragEventsBubbling(value: Boolean): Self = StObject.set(x, "noDragEventsBubbling", value.asInstanceOf[js.Any])
      
      inline def setNoDragEventsBubblingUndefined: Self = StObject.set(x, "noDragEventsBubbling", js.undefined)
      
      inline def setNoDragUndefined: Self = StObject.set(x, "noDrag", js.undefined)
      
      inline def setNoKeyboard(value: Boolean): Self = StObject.set(x, "noKeyboard", value.asInstanceOf[js.Any])
      
      inline def setNoKeyboardUndefined: Self = StObject.set(x, "noKeyboard", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDrop(
        value: (/* acceptedFiles */ js.Array[File], /* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      inline def setOnDropAccepted(value: (/* files */ js.Array[File], /* event */ DropEvent) => Unit): Self = StObject.set(x, "onDropAccepted", js.Any.fromFunction2(value))
      
      inline def setOnDropAcceptedUndefined: Self = StObject.set(x, "onDropAccepted", js.undefined)
      
      inline def setOnDropRejected(value: (/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Unit): Self = StObject.set(x, "onDropRejected", js.Any.fromFunction2(value))
      
      inline def setOnDropRejectedUndefined: Self = StObject.set(x, "onDropRejected", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFileDialogCancel(value: () => Unit): Self = StObject.set(x, "onFileDialogCancel", js.Any.fromFunction0(value))
      
      inline def setOnFileDialogCancelUndefined: Self = StObject.set(x, "onFileDialogCancel", js.undefined)
      
      inline def setOnFileDialogOpen(value: () => Unit): Self = StObject.set(x, "onFileDialogOpen", js.Any.fromFunction0(value))
      
      inline def setOnFileDialogOpenUndefined: Self = StObject.set(x, "onFileDialogOpen", js.undefined)
      
      inline def setPreventDropOnDocument(value: Boolean): Self = StObject.set(x, "preventDropOnDocument", value.asInstanceOf[js.Any])
      
      inline def setPreventDropOnDocumentUndefined: Self = StObject.set(x, "preventDropOnDocument", js.undefined)
      
      inline def setUseFsAccessApi(value: Boolean): Self = StObject.set(x, "useFsAccessApi", value.asInstanceOf[js.Any])
      
      inline def setUseFsAccessApiUndefined: Self = StObject.set(x, "useFsAccessApi", js.undefined)
      
      inline def setValidator(value: /* file */ File => FileError | js.Array[FileError] | Null): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait DropzoneProps
    extends StObject
       with DropzoneOptions {
    
    var children: js.UndefOr[js.Function1[/* state */ DropzoneState, Element]] = js.undefined
  }
  object DropzoneProps {
    
    inline def apply(): DropzoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneProps]
    }
    
    extension [Self <: DropzoneProps](x: Self) {
      
      inline def setChildren(value: /* state */ DropzoneState => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait DropzoneRef extends StObject {
    
    def open(): Unit
  }
  object DropzoneRef {
    
    inline def apply(open: () => Unit): DropzoneRef = {
      val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[DropzoneRef]
    }
    
    extension [Self <: DropzoneRef](x: Self) {
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  trait DropzoneRootProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var refKey: js.UndefOr[String] = js.undefined
  }
  object DropzoneRootProps {
    
    inline def apply(): DropzoneRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneRootProps]
    }
    
    extension [Self <: DropzoneRootProps](x: Self) {
      
      inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
    }
  }
  
  @js.native
  trait DropzoneState
    extends StObject
       with DropzoneRef {
    
    var acceptedFiles: js.Array[File] = js.native
    
    var fileRejections: js.Array[FileRejection] = js.native
    
    def getInputProps[T /* <: DropzoneInputProps */](): T = js.native
    def getInputProps[T /* <: DropzoneInputProps */](props: T): T = js.native
    
    def getRootProps[T /* <: DropzoneRootProps */](): T = js.native
    def getRootProps[T /* <: DropzoneRootProps */](props: T): T = js.native
    
    var inputRef: RefObject[HTMLInputElement] = js.native
    
    var isDragAccept: Boolean = js.native
    
    var isDragActive: Boolean = js.native
    
    var isDragReject: Boolean = js.native
    
    var isFileDialogActive: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var rootRef: RefObject[HTMLElement] = js.native
  }
  
  trait FileError extends StObject {
    
    var code: ErrorCode | String
    
    var message: String
  }
  object FileError {
    
    inline def apply(code: ErrorCode | String, message: String): FileError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileError]
    }
    
    extension [Self <: FileError](x: Self) {
      
      inline def setCode(value: ErrorCode | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileRejection extends StObject {
    
    var errors: js.Array[FileError]
    
    var file: File
  }
  object FileRejection {
    
    inline def apply(errors: js.Array[FileError], file: File): FileRejection = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRejection]
    }
    
    extension [Self <: FileRejection](x: Self) {
      
      inline def setErrors(value: js.Array[FileError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: FileError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
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
    
    inline def multiple: typings.reactDropzone.reactDropzoneStrings.multiple = "multiple".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.multiple]
    
    inline def onDragEnter: typings.reactDropzone.reactDropzoneStrings.onDragEnter = "onDragEnter".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragEnter]
    
    inline def onDragLeave: typings.reactDropzone.reactDropzoneStrings.onDragLeave = "onDragLeave".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragLeave]
    
    inline def onDragOver: typings.reactDropzone.reactDropzoneStrings.onDragOver = "onDragOver".asInstanceOf[typings.reactDropzone.reactDropzoneStrings.onDragOver]
  }
}
