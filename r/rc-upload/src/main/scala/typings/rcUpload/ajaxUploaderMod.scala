package typings.rcUpload

import typings.rcUpload.anon.Uid
import typings.rcUpload.interfaceMod.RcFile
import typings.rcUpload.interfaceMod.UploadProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.FileList
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxUploaderMod {
  
  @JSImport("rc-upload/es/AjaxUploader", JSImport.Default)
  @js.native
  class default () extends AjaxUploader
  
  @js.native
  trait AjaxUploader
    extends Component[UploadProps, js.Object, js.Any] {
    
    var _isMounted: js.Any = js.native
    
    def abort(): Unit = js.native
    def abort(file: js.Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAjaxUploader(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAjaxUploader(): Unit = js.native
    
    var fileInput: js.Any = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClick(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def post(file: RcFile): Unit = js.native
    
    var reqs: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def saveFileInput(node: HTMLInputElement): Unit = js.native
    
    @JSName("state")
    var state_AjaxUploader: Uid = js.native
    
    def upload(file: RcFile, fileList: js.Array[RcFile]): Unit = js.native
    
    def uploadFiles(files: FileList): Unit = js.native
  }
}
