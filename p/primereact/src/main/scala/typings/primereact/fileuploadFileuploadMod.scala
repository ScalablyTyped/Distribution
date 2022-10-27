package typings.primereact

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.DragEvent
import typings.std.Event
import typings.std.File
import typings.std.FormData
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileuploadFileuploadMod {
  
  @JSImport("primereact/fileupload/fileupload", "FileUpload")
  @js.native
  open class FileUpload protected () extends Component[FileUploadProps, Any, Any] {
    def this(props: FileUploadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploadProps, context: Any) = this()
    
    def clear(): Unit = js.native
    
    def formatSize(bytes: Double): Double = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getFiles(): js.Array[File] = js.native
    
    def getInput(): HTMLInputElement = js.native
    
    def onFileSelect(event: FileUploadSelectParams): Unit = js.native
    
    def upload(): Unit = js.native
  }
  
  type FileUploadBeforeSendParams = FileUploadBeforeUploadParams
  
  trait FileUploadBeforeUploadParams extends StObject {
    
    var formData: FormData
    
    var xhr: XMLHttpRequest
  }
  object FileUploadBeforeUploadParams {
    
    inline def apply(formData: FormData, xhr: XMLHttpRequest): FileUploadBeforeUploadParams = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadBeforeUploadParams]
    }
    
    extension [Self <: FileUploadBeforeUploadParams](x: Self) {
      
      inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  type FileUploadEmptyTemplateType = ReactNode | (js.Function1[/* props */ FileUploadProps, ReactNode])
  
  type FileUploadErrorParams = FileUploadUploadParams
  
  trait FileUploadFilesParam extends StObject {
    
    var files: js.Array[File]
  }
  object FileUploadFilesParam {
    
    inline def apply(files: js.Array[File]): FileUploadFilesParam = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadFilesParam]
    }
    
    extension [Self <: FileUploadFilesParam](x: Self) {
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  trait FileUploadHandlerOptions extends StObject {
    
    def clear(): Unit
    
    var props: FileUploadProps
  }
  object FileUploadHandlerOptions {
    
    inline def apply(clear: () => Unit, props: FileUploadProps): FileUploadHandlerOptions = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHandlerOptions]
    }
    
    extension [Self <: FileUploadHandlerOptions](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setProps(value: FileUploadProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadHandlerParam
    extends StObject
       with FileUploadFilesParam {
    
    var options: FileUploadHandlerOptions
  }
  object FileUploadHandlerParam {
    
    inline def apply(files: js.Array[File], options: FileUploadHandlerOptions): FileUploadHandlerParam = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHandlerParam]
    }
    
    extension [Self <: FileUploadHandlerParam](x: Self) {
      
      inline def setOptions(value: FileUploadHandlerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadHeaderTemplateOptions extends StObject {
    
    var cancelButton: Element
    
    var chooseButton: Element
    
    var className: String
    
    var element: Element
    
    var props: FileUploadProps
    
    var uploadButton: Element
  }
  object FileUploadHeaderTemplateOptions {
    
    inline def apply(
      cancelButton: Element,
      chooseButton: Element,
      className: String,
      element: Element,
      props: FileUploadProps,
      uploadButton: Element
    ): FileUploadHeaderTemplateOptions = {
      val __obj = js.Dynamic.literal(cancelButton = cancelButton.asInstanceOf[js.Any], chooseButton = chooseButton.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], uploadButton = uploadButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHeaderTemplateOptions]
    }
    
    extension [Self <: FileUploadHeaderTemplateOptions](x: Self) {
      
      inline def setCancelButton(value: Element): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      inline def setChooseButton(value: Element): Self = StObject.set(x, "chooseButton", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setProps(value: FileUploadProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setUploadButton(value: Element): Self = StObject.set(x, "uploadButton", value.asInstanceOf[js.Any])
    }
  }
  
  type FileUploadHeaderTemplateType = ReactNode | (js.Function1[/* options */ FileUploadHeaderTemplateOptions, ReactNode])
  
  type FileUploadItemTemplateType = ReactNode | (js.Function2[/* file */ js.Object, /* options */ ItemTemplateOptions, ReactNode])
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.basic
    - typings.primereact.primereactStrings.advanced
  */
  trait FileUploadModeType extends StObject
  object FileUploadModeType {
    
    inline def advanced: typings.primereact.primereactStrings.advanced = "advanced".asInstanceOf[typings.primereact.primereactStrings.advanced]
    
    inline def basic: typings.primereact.primereactStrings.basic = "basic".asInstanceOf[typings.primereact.primereactStrings.basic]
  }
  
  trait FileUploadOptionsType extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<FileUploadProps> */ Any
      ] = js.undefined
    
    var iconOnly: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FileUploadOptionsType {
    
    inline def apply(): FileUploadOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadOptionsType]
    }
    
    extension [Self <: FileUploadOptionsType](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<FileUploadProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconOnly(value: Boolean): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
      
      inline def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type FileUploadProgressBarTemplateType = ReactNode | (js.Function1[/* props */ FileUploadProps, ReactNode])
  
  trait FileUploadProgressParams extends StObject {
    
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
    
    var progress: Double
  }
  object FileUploadProgressParams {
    
    inline def apply(originalEvent: SyntheticEvent[typings.std.Element, Event], progress: Double): FileUploadProgressParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadProgressParams]
    }
    
    extension [Self <: FileUploadProgressParams](x: Self) {
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadProps extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    var cancelOptions: js.UndefOr[FileUploadOptionsType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var chooseLabel: js.UndefOr[String] = js.undefined
    
    var chooseOptions: js.UndefOr[FileUploadOptionsType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var customUpload: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var emptyTemplate: js.UndefOr[FileUploadEmptyTemplateType] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var headerTemplate: js.UndefOr[FileUploadHeaderTemplateType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var invalidFileSizeMessageDetail: js.UndefOr[String] = js.undefined
    
    var invalidFileSizeMessageSummary: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[FileUploadItemTemplateType] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[FileUploadModeType] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBeforeDrop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var onBeforeSelect: js.UndefOr[js.Function1[/* e */ FileUploadSelectParams, Unit]] = js.undefined
    
    var onBeforeSend: js.UndefOr[js.Function1[/* e */ FileUploadBeforeSendParams, Unit]] = js.undefined
    
    var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FileUploadBeforeUploadParams, Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ FileUploadErrorParams, Unit]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* e */ FileUploadProgressParams, Unit]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* e */ FileUploadRemoveParams, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ FileUploadSelectParams, Unit]] = js.undefined
    
    var onUpload: js.UndefOr[js.Function1[/* e */ FileUploadUploadParams, Unit]] = js.undefined
    
    var onValidationFail: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
    
    var previewWidth: js.UndefOr[Double] = js.undefined
    
    var progressBarTemplate: js.UndefOr[FileUploadProgressBarTemplateType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var uploadHandler: js.UndefOr[js.Function1[/* e */ FileUploadHandlerParam, Unit]] = js.undefined
    
    var uploadLabel: js.UndefOr[String] = js.undefined
    
    var uploadOptions: js.UndefOr[FileUploadOptionsType] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object FileUploadProps {
    
    inline def apply(): FileUploadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadProps]
    }
    
    extension [Self <: FileUploadProps](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setCancelOptions(value: FileUploadOptionsType): Self = StObject.set(x, "cancelOptions", value.asInstanceOf[js.Any])
      
      inline def setCancelOptionsUndefined: Self = StObject.set(x, "cancelOptions", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChooseLabel(value: String): Self = StObject.set(x, "chooseLabel", value.asInstanceOf[js.Any])
      
      inline def setChooseLabelUndefined: Self = StObject.set(x, "chooseLabel", js.undefined)
      
      inline def setChooseOptions(value: FileUploadOptionsType): Self = StObject.set(x, "chooseOptions", value.asInstanceOf[js.Any])
      
      inline def setChooseOptionsUndefined: Self = StObject.set(x, "chooseOptions", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setCustomUpload(value: Boolean): Self = StObject.set(x, "customUpload", value.asInstanceOf[js.Any])
      
      inline def setCustomUploadUndefined: Self = StObject.set(x, "customUpload", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmptyTemplate(value: FileUploadEmptyTemplateType): Self = StObject.set(x, "emptyTemplate", value.asInstanceOf[js.Any])
      
      inline def setEmptyTemplateFunction1(value: /* props */ FileUploadProps => ReactNode): Self = StObject.set(x, "emptyTemplate", js.Any.fromFunction1(value))
      
      inline def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderTemplate(value: FileUploadHeaderTemplateType): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateFunction1(value: /* options */ FileUploadHeaderTemplateOptions => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction1(value))
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInvalidFileSizeMessageDetail(value: String): Self = StObject.set(x, "invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageDetailUndefined: Self = StObject.set(x, "invalidFileSizeMessageDetail", js.undefined)
      
      inline def setInvalidFileSizeMessageSummary(value: String): Self = StObject.set(x, "invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageSummaryUndefined: Self = StObject.set(x, "invalidFileSizeMessageSummary", js.undefined)
      
      inline def setItemTemplate(value: FileUploadItemTemplateType): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction2(value: (/* file */ js.Object, /* options */ ItemTemplateOptions) => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMode(value: FileUploadModeType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBeforeDrop(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onBeforeDrop", js.Any.fromFunction1(value))
      
      inline def setOnBeforeDropUndefined: Self = StObject.set(x, "onBeforeDrop", js.undefined)
      
      inline def setOnBeforeSelect(value: /* e */ FileUploadSelectParams => Unit): Self = StObject.set(x, "onBeforeSelect", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSelectUndefined: Self = StObject.set(x, "onBeforeSelect", js.undefined)
      
      inline def setOnBeforeSend(value: /* e */ FileUploadBeforeSendParams => Unit): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
      
      inline def setOnBeforeUpload(value: /* e */ FileUploadBeforeUploadParams => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
      
      inline def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnError(value: /* e */ FileUploadErrorParams => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnProgress(value: /* e */ FileUploadProgressParams => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRemove(value: /* e */ FileUploadRemoveParams => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnSelect(value: /* e */ FileUploadSelectParams => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnUpload(value: /* e */ FileUploadUploadParams => Unit): Self = StObject.set(x, "onUpload", js.Any.fromFunction1(value))
      
      inline def setOnUploadUndefined: Self = StObject.set(x, "onUpload", js.undefined)
      
      inline def setOnValidationFail(value: /* file */ File => Unit): Self = StObject.set(x, "onValidationFail", js.Any.fromFunction1(value))
      
      inline def setOnValidationFailUndefined: Self = StObject.set(x, "onValidationFail", js.undefined)
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      inline def setProgressBarTemplate(value: FileUploadProgressBarTemplateType): Self = StObject.set(x, "progressBarTemplate", value.asInstanceOf[js.Any])
      
      inline def setProgressBarTemplateFunction1(value: /* props */ FileUploadProps => ReactNode): Self = StObject.set(x, "progressBarTemplate", js.Any.fromFunction1(value))
      
      inline def setProgressBarTemplateUndefined: Self = StObject.set(x, "progressBarTemplate", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUploadHandler(value: /* e */ FileUploadHandlerParam => Unit): Self = StObject.set(x, "uploadHandler", js.Any.fromFunction1(value))
      
      inline def setUploadHandlerUndefined: Self = StObject.set(x, "uploadHandler", js.undefined)
      
      inline def setUploadLabel(value: String): Self = StObject.set(x, "uploadLabel", value.asInstanceOf[js.Any])
      
      inline def setUploadLabelUndefined: Self = StObject.set(x, "uploadLabel", js.undefined)
      
      inline def setUploadOptions(value: FileUploadOptionsType): Self = StObject.set(x, "uploadOptions", value.asInstanceOf[js.Any])
      
      inline def setUploadOptionsUndefined: Self = StObject.set(x, "uploadOptions", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait FileUploadRemoveParams extends StObject {
    
    var file: File
    
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
  }
  object FileUploadRemoveParams {
    
    inline def apply(file: File, originalEvent: SyntheticEvent[typings.std.Element, Event]): FileUploadRemoveParams = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadRemoveParams]
    }
    
    extension [Self <: FileUploadRemoveParams](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadSelectParams
    extends StObject
       with FileUploadFilesParam {
    
    var originalEvent: ChangeEvent[HTMLInputElement] | DragEvent
  }
  object FileUploadSelectParams {
    
    inline def apply(files: js.Array[File], originalEvent: ChangeEvent[HTMLInputElement] | DragEvent): FileUploadSelectParams = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadSelectParams]
    }
    
    extension [Self <: FileUploadSelectParams](x: Self) {
      
      inline def setOriginalEvent(value: ChangeEvent[HTMLInputElement] | DragEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadUploadParams
    extends StObject
       with FileUploadFilesParam {
    
    var xhr: XMLHttpRequest
  }
  object FileUploadUploadParams {
    
    inline def apply(files: js.Array[File], xhr: XMLHttpRequest): FileUploadUploadParams = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadUploadParams]
    }
    
    extension [Self <: FileUploadUploadParams](x: Self) {
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemTemplateOptions extends StObject {
    
    var element: Element
    
    var fileNameElement: Element
    
    var files: js.Array[File]
    
    var formatSize: String
    
    var index: Double
    
    def onRemove(event: SyntheticEvent[typings.std.Element, Event]): Unit
    
    var previewElement: Element
    
    var props: FileUploadProps
    
    var removeElement: Element
    
    var sizeElement: Element
  }
  object ItemTemplateOptions {
    
    inline def apply(
      element: Element,
      fileNameElement: Element,
      files: js.Array[File],
      formatSize: String,
      index: Double,
      onRemove: SyntheticEvent[typings.std.Element, Event] => Unit,
      previewElement: Element,
      props: FileUploadProps,
      removeElement: Element,
      sizeElement: Element
    ): ItemTemplateOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], fileNameElement = fileNameElement.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], formatSize = formatSize.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), previewElement = previewElement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], removeElement = removeElement.asInstanceOf[js.Any], sizeElement = sizeElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemTemplateOptions]
    }
    
    extension [Self <: ItemTemplateOptions](x: Self) {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFileNameElement(value: Element): Self = StObject.set(x, "fileNameElement", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFormatSize(value: String): Self = StObject.set(x, "formatSize", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnRemove(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setPreviewElement(value: Element): Self = StObject.set(x, "previewElement", value.asInstanceOf[js.Any])
      
      inline def setProps(value: FileUploadProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRemoveElement(value: Element): Self = StObject.set(x, "removeElement", value.asInstanceOf[js.Any])
      
      inline def setSizeElement(value: Element): Self = StObject.set(x, "sizeElement", value.asInstanceOf[js.Any])
    }
  }
}
