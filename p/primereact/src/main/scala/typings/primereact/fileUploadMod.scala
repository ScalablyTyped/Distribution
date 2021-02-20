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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait FileUploadProps extends StObject {
    
    var accept: js.UndefOr[String] = js.native
    
    var auto: js.UndefOr[Boolean] = js.native
    
    var cancelLabel: js.UndefOr[String] = js.native
    
    var chooseLabel: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var customUpload: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var emptyTemplate: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var invalidFileSizeMessageDetail: js.UndefOr[String] = js.native
    
    var invalidFileSizeMessageSummary: js.UndefOr[String] = js.native
    
    var maxFileSize: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[String] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBeforeSend: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
    
    var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
    
    var onProgress: js.UndefOr[js.Function1[/* e */ Progress, Unit]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* e */ File, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* e */ FilesOriginalEvent, Unit]] = js.native
    
    var onUpload: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
    
    var onValidationFail: js.UndefOr[js.Function1[/* file */ typings.std.File, Unit]] = js.native
    
    var previewWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var uploadHandler: js.UndefOr[js.Function1[/* e */ FilesAny, Unit]] = js.native
    
    var uploadLabel: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object FileUploadProps {
    
    @scala.inline
    def apply(): FileUploadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadProps]
    }
    
    @scala.inline
    implicit class FileUploadPropsMutableBuilder[Self <: FileUploadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      @scala.inline
      def setChooseLabel(value: String): Self = StObject.set(x, "chooseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChooseLabelUndefined: Self = StObject.set(x, "chooseLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomUpload(value: Boolean): Self = StObject.set(x, "customUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUploadUndefined: Self = StObject.set(x, "customUpload", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEmptyTemplate(value: /* props */ js.Object => _): Self = StObject.set(x, "emptyTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInvalidFileSizeMessageDetail(value: String): Self = StObject.set(x, "invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidFileSizeMessageDetailUndefined: Self = StObject.set(x, "invalidFileSizeMessageDetail", js.undefined)
      
      @scala.inline
      def setInvalidFileSizeMessageSummary(value: String): Self = StObject.set(x, "invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidFileSizeMessageSummaryUndefined: Self = StObject.set(x, "invalidFileSizeMessageSummary", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBeforeSend(value: /* e */ FormData => Unit): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
      
      @scala.inline
      def setOnBeforeUpload(value: /* e */ FormData => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnError(value: /* e */ Files => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* e */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* e */ File => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ FilesOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnUpload(value: /* e */ Files => Unit): Self = StObject.set(x, "onUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUploadUndefined: Self = StObject.set(x, "onUpload", js.undefined)
      
      @scala.inline
      def setOnValidationFail(value: /* file */ typings.std.File => Unit): Self = StObject.set(x, "onValidationFail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidationFailUndefined: Self = StObject.set(x, "onValidationFail", js.undefined)
      
      @scala.inline
      def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUploadHandler(value: /* e */ FilesAny => Unit): Self = StObject.set(x, "uploadHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadHandlerUndefined: Self = StObject.set(x, "uploadHandler", js.undefined)
      
      @scala.inline
      def setUploadLabel(value: String): Self = StObject.set(x, "uploadLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadLabelUndefined: Self = StObject.set(x, "uploadLabel", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
