package typings.rcUpload

import typings.rcUpload.anon.Uid
import typings.rcUpload.esInterfaceMod.RcFile
import typings.rcUpload.esInterfaceMod.UploadProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.File
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAjaxUploaderMod {
  
  @JSImport("rc-upload/es/AjaxUploader", JSImport.Default)
  @js.native
  open class default () extends AjaxUploader
  
  @js.native
  trait AjaxUploader
    extends Component[UploadProps, js.Object, Any] {
    
    /* private */ var _isMounted: Any = js.native
    
    def abort(): Unit = js.native
    def abort(file: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAjaxUploader(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAjaxUploader(): Unit = js.native
    
    /* private */ var fileInput: Any = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClick(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def post(hasDataOriginActionParsedFile: ParsedFileInfo): Unit = js.native
    
    /**
      * Process file before upload. When all the file is ready, we start upload.
      */
    def processFile(file: RcFile, fileList: js.Array[RcFile]): js.Promise[ParsedFileInfo] = js.native
    
    var reqs: Any = js.native
    
    def reset(): Unit = js.native
    
    def saveFileInput(node: HTMLInputElement): Unit = js.native
    
    @JSName("state")
    var state_AjaxUploader: Uid = js.native
    
    def uploadFiles(files: js.Array[File]): Unit = js.native
  }
  
  trait ParsedFileInfo extends StObject {
    
    var action: String
    
    var data: Record[String, Any]
    
    var origin: RcFile
    
    var parsedFile: RcFile
  }
  object ParsedFileInfo {
    
    inline def apply(action: String, data: Record[String, Any], origin: RcFile, parsedFile: RcFile): ParsedFileInfo = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], parsedFile = parsedFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFileInfo]
    }
    
    extension [Self <: ParsedFileInfo](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: RcFile): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setParsedFile(value: RcFile): Self = StObject.set(x, "parsedFile", value.asInstanceOf[js.Any])
    }
  }
}
