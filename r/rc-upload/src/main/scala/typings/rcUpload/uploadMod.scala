package typings.rcUpload

import typings.rcUpload.interfaceMod.RcFile
import typings.rcUpload.interfaceMod.UploadProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod {
  
  @JSImport("rc-upload/es/Upload", JSImport.Default)
  @js.native
  open class default () extends Upload
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.beforeUpload")
      @js.native
      def beforeUpload: Any = js.native
      inline def beforeUpload_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.component")
      @js.native
      def component: String = js.native
      inline def component_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.customRequest")
      @js.native
      def customRequest: Any = js.native
      inline def customRequest_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customRequest")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.multipart")
      @js.native
      def multipart: Boolean = js.native
      inline def multipart_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipart")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      inline def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.onError")
      @js.native
      def onError: js.Function0[Unit] = js.native
      inline def onError_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.onStart")
      @js.native
      def onStart: js.Function0[Unit] = js.native
      inline def onStart_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStart")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.onSuccess")
      @js.native
      def onSuccess: js.Function0[Unit] = js.native
      inline def onSuccess_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.openFileDialogOnClick")
      @js.native
      def openFileDialogOnClick: Boolean = js.native
      inline def openFileDialogOnClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openFileDialogOnClick")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-upload/es/Upload", "default.defaultProps.withCredentials")
      @js.native
      def withCredentials: Boolean = js.native
      inline def withCredentials_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Upload
    extends Component[UploadProps, js.Object, Any] {
    
    def abort(file: RcFile): Unit = js.native
    
    def saveUploader(node: typings.rcUpload.ajaxUploaderMod.default): Unit = js.native
    
    /* private */ var uploader: Any = js.native
  }
}
