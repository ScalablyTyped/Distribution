package typings.rcUpload

import typings.rcUpload.anon.BeforeUpload
import typings.rcUpload.interfaceMod.RcFile
import typings.rcUpload.interfaceMod.UploadProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-upload/es/Upload", JSImport.Namespace)
@js.native
object uploadMod extends js.Object {
  
  @js.native
  trait Upload
    extends Component[UploadProps, js.Object, js.Any] {
    
    def abort(file: RcFile): Unit = js.native
    
    def saveUploader(node: typings.rcUpload.ajaxUploaderMod.default): Unit = js.native
    
    var uploader: js.Any = js.native
  }
  
  @js.native
  class default () extends Upload
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: BeforeUpload = js.native
  }
}
