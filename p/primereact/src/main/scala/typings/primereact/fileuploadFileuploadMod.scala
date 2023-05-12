package typings.primereact

import typings.primereact.primereactStrings.advanced
import typings.primereact.primereactStrings.basic
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
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploadProps, context: Any) = this()
    
    /**
      * Clears the files list.
      */
    def clear(): Unit = js.native
    
    /**
      * Formats the number of bytes.
      * @param {number} bytes - Custom size event.
      */
    def formatSize(bytes: Double): Double = js.native
    
    /**
      * Used to get container element.
      * @return {HTMLElement} Container element
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Gets the current files list.
      * @return {File[]} Current files.
      */
    def getFiles(): js.Array[File] = js.native
    
    /**
      * Used to get input element.
      * @return {HTMLInputElement} Input element
      */
    def getInput(): HTMLInputElement = js.native
    
    /**
      * Handles file selection event and updates.
      * @param {FileUploadSelectEvent} event - Custom select event.
      */
    def onFileSelect(event: FileUploadSelectEvent): Unit = js.native
    
    /**
      * Sets the current files list.
      * @param {File[]} files - Current files.
      */
    def setFiles(files: js.Array[File]): Unit = js.native
    
    /**
      * Uploads the selected files.
      */
    def upload(): Unit = js.native
  }
  
  /**
    * Custom before send event.
    * @see {@link FileUploadProps.onBeforeSend}
    * @extends {FileUploadBeforeUploadEvent}
    * @event
    */
  type FileUploadBeforeSendEvent = FileUploadBeforeUploadEvent
  
  /**
    * Custom before upload event.
    * @see {@link FileUploadProps.onBeforeUpload}
    * @event
    */
  trait FileUploadBeforeUploadEvent extends StObject {
    
    /**
      * FormData object.
      */
    var formData: FormData
    
    /**
      * XmlHttpRequest instance.
      */
    var xhr: XMLHttpRequest
  }
  object FileUploadBeforeUploadEvent {
    
    inline def apply(formData: FormData, xhr: XMLHttpRequest): FileUploadBeforeUploadEvent = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadBeforeUploadEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadBeforeUploadEvent] (val x: Self) extends AnyVal {
      
      inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom error event.
    * @see {@link FileUploadProps.onError}
    * @extends {FileUploadUploadEvent}
    * @event
    */
  type FileUploadErrorEvent = FileUploadUploadEvent
  
  /**
    * Custom file upload event.
    */
  trait FileUploadFilesEvent extends StObject {
    
    /**
      * Uploaded files.
      */
    var files: js.Array[File]
  }
  object FileUploadFilesEvent {
    
    inline def apply(files: js.Array[File]): FileUploadFilesEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadFilesEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadFilesEvent] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  /**
    * Custom uploadHandler event.
    * @see {@link FileUploadProps.uploadHandler}
    * @extends {FileUploadFilesEvent}
    * @event
    */
  trait FileUploadHandlerEvent
    extends StObject
       with FileUploadFilesEvent {
    
    /**
      * Handler options.
      */
    var options: FileUploadHandlerOptions
  }
  object FileUploadHandlerEvent {
    
    inline def apply(files: js.Array[File], options: FileUploadHandlerOptions): FileUploadHandlerEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHandlerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadHandlerEvent] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: FileUploadHandlerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom file upload handler options
    */
  trait FileUploadHandlerOptions extends StObject {
    
    /**
      * Clears the current files selected for upload.
      */
    def clear(): Unit
    
    /**
      * All component props
      * @type {FileUploadProps}
      */
    var props: FileUploadProps
  }
  object FileUploadHandlerOptions {
    
    inline def apply(clear: () => Unit, props: FileUploadProps): FileUploadHandlerOptions = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setProps(value: FileUploadProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom file upload header options
    */
  trait FileUploadHeaderTemplateOptions extends StObject {
    
    /**
      * The cancel button element.
      */
    var cancelButton: Element
    
    /**
      * The choose button element.
      */
    var chooseButton: Element
    
    /**
      * The class name for the header element.
      */
    var className: String
    
    /**
      * The default element created by the component.
      */
    var element: Element
    
    /**
      * The props passed to the component.
      * @type {FileUploadProps}
      */
    var props: FileUploadProps
    
    /**
      * The upload button element.
      */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadHeaderTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setCancelButton(value: Element): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      inline def setChooseButton(value: Element): Self = StObject.set(x, "chooseButton", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setProps(value: FileUploadProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setUploadButton(value: Element): Self = StObject.set(x, "uploadButton", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom file upload options
    */
  trait FileUploadOptions extends StObject {
    
    /**
      * Style class of the component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the image to display.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<FileUploadProps> */ Any
      ] = js.undefined
    
    /**
      * Defines whether to display only the icon.
      */
    var iconOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the text to display.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FileUploadOptions {
    
    inline def apply(): FileUploadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
      
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
  
  /**
    * Custom progress event.
    * @see {@link FileUploadProps.onProgress}
    * @event
    */
  trait FileUploadProgressEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
    
    /**
      * Calculated progress value.
      */
    var progress: Double
  }
  object FileUploadProgressEvent {
    
    inline def apply(originalEvent: SyntheticEvent[typings.std.Element, Event], progress: Double): FileUploadProgressEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadProgressEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadProgressEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Defines valid properties in FileUpload component.
    * @group Properties
    */
  trait FileUploadProps extends StObject {
    
    /**
      * Pattern to restrict the allowed file types such as "image/ *".
      * @defaultValue false
      */
    var accept: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled, upload begins automatically after selection is completed.
      * @defaultValue false
      */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label of the cancel button. Defaults to global value in Locale configuration.
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Options used to customize the cancel button. These options have "label", "icon", "className" and "style" properties.
      */
    var cancelOptions: js.UndefOr[FileUploadOptions] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Label of the choose button. Defaults to global value in Locale configuration.
      */
    var chooseLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Options used to customize the choose button. These options have "label", "icon", "className" and "style" properties.
      */
    var chooseOptions: js.UndefOr[FileUploadOptions] = js.undefined
    
    /**
      * Style class of the component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Style class of the content.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the content.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether to use the default upload or a manual implementation defined in uploadHandler callback.
      * @defaultValue false
      */
    var customUpload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables the upload functionality.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom template of empty content in the container.
      */
    var emptyTemplate: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * Custom template of the header.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the header.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Custom template of the header.
      */
    var headerTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ FileUploadHeaderTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Detail message of the invalid fize size.
      * @defaultValue "Maximum upload size is."
      */
    var invalidFileSizeMessageDetail: js.UndefOr[String] = js.undefined
    
    /**
      * Summary message of the invalid fize size.
      * @defaultValue Invalid file size
      */
    var invalidFileSizeMessageSummary: js.UndefOr[String] = js.undefined
    
    /**
      * Custom template of each item content in the container.
      */
    var itemTemplate: js.UndefOr[
        ReactNode | (js.Function2[/* file */ js.Object, /* options */ ItemTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Maximum file size allowed in bytes.
      */
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the UI of the component, possible values are "advanced" and "basic".
      * @defaultValue advanced
      */
    var mode: js.UndefOr[basic | advanced] = js.undefined
    
    /**
      * Used to select multiple files at once from file dialog.
      * @defaultValue false
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the request parameter to identify the files at backend.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to invoke before files dropped. Return false from callback to prevent drop.
      * @param {DragEvent} event - DragEvent instance.
      */
    var onBeforeDrop: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke before files are selected. Return false from callback to prevent selection.
      * @param {FileUploadSelectEvent} event - Custom select event.
      */
    var onBeforeSelect: js.UndefOr[js.Function1[/* event */ FileUploadSelectEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke before file send begins to customize the request such as adding headers.
      * @param {FileUploadBeforeSendEvent} event - Browser event.
      */
    var onBeforeSend: js.UndefOr[js.Function1[/* event */ FileUploadBeforeSendEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke before file upload begins to customize the request such as post parameters before the files.
      * @param {FileUploadBeforeUploadEvent} event - Custom beforeUpload.
      */
    var onBeforeUpload: js.UndefOr[js.Function1[/* event */ FileUploadBeforeUploadEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when files in queue are removed without uploading.
      */
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback to invoke if file upload fails.
      * @param {FileUploadErrorEvent} event - Custom error event.
      */
    var onError: js.UndefOr[js.Function1[/* event */ FileUploadErrorEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when files are being uploaded.
      * @param {FileUploadProgressEvent} event - Custom progress event.
      */
    var onProgress: js.UndefOr[js.Function1[/* event */ FileUploadProgressEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a file is removed without uploading using clear button of a file.
      * @param {FileUploadRemoveEvent} event - Custom remove event.
      */
    var onRemove: js.UndefOr[js.Function1[/* event */ FileUploadRemoveEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when files are selected.
      * @param {FileUploadSelectEvent} event - Custom select event.
      */
    var onSelect: js.UndefOr[js.Function1[/* event */ FileUploadSelectEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when file upload is complete.
      * @param {FileUploadUploadEvent} event - Custom upload event.
      */
    var onUpload: js.UndefOr[js.Function1[/* event */ FileUploadUploadEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a validation file fails.
      * @param {File} file - Invalid file.
      */
    var onValidationFail: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
    
    /**
      * Width of the image thumbnail in pixels.
      * @defaultValue 50
      */
    var previewWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom template of progressBar content in the container.
      */
    var progressBarTemplate: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * Icon of the remove element.
      */
    var removeIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<FileUploadProps> */ Any
      ] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Callback to invoke in custom upload mode to upload the files manually.
      * @param {FileUploadHandlerEvent} event - Custom uploadHandler event
      */
    var uploadHandler: js.UndefOr[js.Function1[/* event */ FileUploadHandlerEvent, Unit]] = js.undefined
    
    /**
      * Label of the upload button. Defaults to global value in Locale configuration.
      */
    var uploadLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Options used to customize the upload button. These options have "label", "icon", "className" and "style" properties.
      */
    var uploadOptions: js.UndefOr[FileUploadOptions] = js.undefined
    
    /**
      * Remote url to upload the files.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Cross-site Access-Control requests should be made using credentials such as cookies, authorization headers or TLS client certificates.
      * @defaultValue false
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object FileUploadProps {
    
    inline def apply(): FileUploadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadProps] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setCancelOptions(value: FileUploadOptions): Self = StObject.set(x, "cancelOptions", value.asInstanceOf[js.Any])
      
      inline def setCancelOptionsUndefined: Self = StObject.set(x, "cancelOptions", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChooseLabel(value: String): Self = StObject.set(x, "chooseLabel", value.asInstanceOf[js.Any])
      
      inline def setChooseLabelUndefined: Self = StObject.set(x, "chooseLabel", js.undefined)
      
      inline def setChooseOptions(value: FileUploadOptions): Self = StObject.set(x, "chooseOptions", value.asInstanceOf[js.Any])
      
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
      
      inline def setEmptyTemplate(value: ReactNode | (js.Function1[FileUploadProps, ReactNode])): Self = StObject.set(x, "emptyTemplate", value.asInstanceOf[js.Any])
      
      inline def setEmptyTemplateFunction1(value: FileUploadProps => ReactNode): Self = StObject.set(x, "emptyTemplate", js.Any.fromFunction1(value))
      
      inline def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderTemplate(value: ReactNode | (js.Function1[/* options */ FileUploadHeaderTemplateOptions, ReactNode])): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateFunction1(value: /* options */ FileUploadHeaderTemplateOptions => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction1(value))
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInvalidFileSizeMessageDetail(value: String): Self = StObject.set(x, "invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageDetailUndefined: Self = StObject.set(x, "invalidFileSizeMessageDetail", js.undefined)
      
      inline def setInvalidFileSizeMessageSummary(value: String): Self = StObject.set(x, "invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageSummaryUndefined: Self = StObject.set(x, "invalidFileSizeMessageSummary", js.undefined)
      
      inline def setItemTemplate(
        value: ReactNode | (js.Function2[/* file */ js.Object, /* options */ ItemTemplateOptions, ReactNode])
      ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction2(value: (/* file */ js.Object, /* options */ ItemTemplateOptions) => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMode(value: basic | advanced): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBeforeDrop(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onBeforeDrop", js.Any.fromFunction1(value))
      
      inline def setOnBeforeDropUndefined: Self = StObject.set(x, "onBeforeDrop", js.undefined)
      
      inline def setOnBeforeSelect(value: /* event */ FileUploadSelectEvent => Unit): Self = StObject.set(x, "onBeforeSelect", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSelectUndefined: Self = StObject.set(x, "onBeforeSelect", js.undefined)
      
      inline def setOnBeforeSend(value: /* event */ FileUploadBeforeSendEvent => Unit): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
      
      inline def setOnBeforeUpload(value: /* event */ FileUploadBeforeUploadEvent => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
      
      inline def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnError(value: /* event */ FileUploadErrorEvent => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnProgress(value: /* event */ FileUploadProgressEvent => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRemove(value: /* event */ FileUploadRemoveEvent => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnSelect(value: /* event */ FileUploadSelectEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnUpload(value: /* event */ FileUploadUploadEvent => Unit): Self = StObject.set(x, "onUpload", js.Any.fromFunction1(value))
      
      inline def setOnUploadUndefined: Self = StObject.set(x, "onUpload", js.undefined)
      
      inline def setOnValidationFail(value: /* file */ File => Unit): Self = StObject.set(x, "onValidationFail", js.Any.fromFunction1(value))
      
      inline def setOnValidationFailUndefined: Self = StObject.set(x, "onValidationFail", js.undefined)
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      inline def setProgressBarTemplate(value: ReactNode | (js.Function1[FileUploadProps, ReactNode])): Self = StObject.set(x, "progressBarTemplate", value.asInstanceOf[js.Any])
      
      inline def setProgressBarTemplateFunction1(value: FileUploadProps => ReactNode): Self = StObject.set(x, "progressBarTemplate", js.Any.fromFunction1(value))
      
      inline def setProgressBarTemplateUndefined: Self = StObject.set(x, "progressBarTemplate", js.undefined)
      
      inline def setRemoveIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<FileUploadProps> */ Any
      ): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUploadHandler(value: /* event */ FileUploadHandlerEvent => Unit): Self = StObject.set(x, "uploadHandler", js.Any.fromFunction1(value))
      
      inline def setUploadHandlerUndefined: Self = StObject.set(x, "uploadHandler", js.undefined)
      
      inline def setUploadLabel(value: String): Self = StObject.set(x, "uploadLabel", value.asInstanceOf[js.Any])
      
      inline def setUploadLabelUndefined: Self = StObject.set(x, "uploadLabel", js.undefined)
      
      inline def setUploadOptions(value: FileUploadOptions): Self = StObject.set(x, "uploadOptions", value.asInstanceOf[js.Any])
      
      inline def setUploadOptionsUndefined: Self = StObject.set(x, "uploadOptions", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /**
    * Custom remove event.
    * @see {@link FileUploadProps.onRemove}
    * @event
    */
  trait FileUploadRemoveEvent extends StObject {
    
    /**
      * Selected file.
      */
    var file: File
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
  }
  object FileUploadRemoveEvent {
    
    inline def apply(file: File, originalEvent: SyntheticEvent[typings.std.Element, Event]): FileUploadRemoveEvent = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadRemoveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadRemoveEvent] (val x: Self) extends AnyVal {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom select event.
    * @see {@link FileUploadProps.onSelect}, {@link FileUploadProps.onBeforeSelect}
    * @extends {FileUploadFilesEvent}
    * @event
    */
  trait FileUploadSelectEvent
    extends StObject
       with FileUploadFilesEvent {
    
    /**
      * Browser event.
      */
    var originalEvent: ChangeEvent[HTMLInputElement] | DragEvent
  }
  object FileUploadSelectEvent {
    
    inline def apply(files: js.Array[File], originalEvent: ChangeEvent[HTMLInputElement] | DragEvent): FileUploadSelectEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadSelectEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadSelectEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: ChangeEvent[HTMLInputElement] | DragEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom upload event.
    * @see {@link FileUploadProps.onUpload}
    * @extends {FileUploadFilesEvent}
    * @event
    */
  trait FileUploadUploadEvent
    extends StObject
       with FileUploadFilesEvent {
    
    /**
      * XmlHttpRequest instance.
      */
    var xhr: XMLHttpRequest
  }
  object FileUploadUploadEvent {
    
    inline def apply(files: js.Array[File], xhr: XMLHttpRequest): FileUploadUploadEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadUploadEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadUploadEvent] (val x: Self) extends AnyVal {
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom item template options
    */
  trait ItemTemplateOptions extends StObject {
    
    /**
      * Default element created by the component.
      */
    var element: Element
    
    /**
      * Element to display the name of the file.
      */
    var fileNameElement: Element
    
    /**
      * Array of files.
      */
    var files: js.Array[File]
    
    /**
      * Formatted string of the file size.
      */
    var formatSize: String
    
    /**
      * Index of the file.
      */
    var index: Double
    
    /**
      * Callback to invoke when a item template is removed.
      * @param {React.SyntheticEvent} event - Browser event
      */
    def onRemove(event: SyntheticEvent[typings.std.Element, Event]): Unit
    
    /**
      * Element to display preview of the file.
      */
    var previewElement: Element
    
    /**
      * All component props
      * @type {FileUploadProps}
      */
    var props: FileUploadProps
    
    /**
      * Element to display the remove button.
      */
    var removeElement: Element
    
    /**
      * Element to display the size of the file.
      */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemTemplateOptions] (val x: Self) extends AnyVal {
      
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
