package typings.primereact

import typings.primereact.anon.File
import typings.primereact.anon.Files
import typings.primereact.anon.FilesAny
import typings.primereact.anon.FilesOriginalEvent
import typings.primereact.anon.FormData
import typings.primereact.anon.Progress
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploadMod {
  
  @JSImport("primereact/components/fileupload/FileUpload", "FileUpload")
  @js.native
  class FileUpload protected ()
    extends Component[FileUploadProps, js.Any, js.Any] {
    def this(props: FileUploadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploadProps, context: js.Any) = this()
    
    def clear(): Unit = js.native
    
    def upload(): Unit = js.native
  }
  
  trait FileUploadProps extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    var chooseLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var customUpload: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var emptyTemplate: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var invalidFileSizeMessageDetail: js.UndefOr[String] = js.undefined
    
    var invalidFileSizeMessageSummary: js.UndefOr[String] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBeforeSend: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.undefined
    
    var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* e */ Progress, Unit]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* e */ File, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ FilesOriginalEvent, Unit]] = js.undefined
    
    var onUpload: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.undefined
    
    var onValidationFail: js.UndefOr[js.Function1[/* file */ typings.std.File, Unit]] = js.undefined
    
    var previewWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var uploadHandler: js.UndefOr[js.Function1[/* e */ FilesAny, Unit]] = js.undefined
    
    var uploadLabel: js.UndefOr[String] = js.undefined
    
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
      
      inline def setChooseLabel(value: String): Self = StObject.set(x, "chooseLabel", value.asInstanceOf[js.Any])
      
      inline def setChooseLabelUndefined: Self = StObject.set(x, "chooseLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomUpload(value: Boolean): Self = StObject.set(x, "customUpload", value.asInstanceOf[js.Any])
      
      inline def setCustomUploadUndefined: Self = StObject.set(x, "customUpload", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmptyTemplate(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "emptyTemplate", js.Any.fromFunction1(value))
      
      inline def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInvalidFileSizeMessageDetail(value: String): Self = StObject.set(x, "invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageDetailUndefined: Self = StObject.set(x, "invalidFileSizeMessageDetail", js.undefined)
      
      inline def setInvalidFileSizeMessageSummary(value: String): Self = StObject.set(x, "invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
      
      inline def setInvalidFileSizeMessageSummaryUndefined: Self = StObject.set(x, "invalidFileSizeMessageSummary", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBeforeSend(value: /* e */ FormData => Unit): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
      
      inline def setOnBeforeUpload(value: /* e */ FormData => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
      
      inline def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnError(value: /* e */ Files => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnProgress(value: /* e */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRemove(value: /* e */ File => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnSelect(value: /* e */ FilesOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnUpload(value: /* e */ Files => Unit): Self = StObject.set(x, "onUpload", js.Any.fromFunction1(value))
      
      inline def setOnUploadUndefined: Self = StObject.set(x, "onUpload", js.undefined)
      
      inline def setOnValidationFail(value: /* file */ typings.std.File => Unit): Self = StObject.set(x, "onValidationFail", js.Any.fromFunction1(value))
      
      inline def setOnValidationFailUndefined: Self = StObject.set(x, "onValidationFail", js.undefined)
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUploadHandler(value: /* e */ FilesAny => Unit): Self = StObject.set(x, "uploadHandler", js.Any.fromFunction1(value))
      
      inline def setUploadHandlerUndefined: Self = StObject.set(x, "uploadHandler", js.undefined)
      
      inline def setUploadLabel(value: String): Self = StObject.set(x, "uploadLabel", value.asInstanceOf[js.Any])
      
      inline def setUploadLabelUndefined: Self = StObject.set(x, "uploadLabel", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
