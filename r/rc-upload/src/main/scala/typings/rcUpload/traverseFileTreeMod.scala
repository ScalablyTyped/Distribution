package typings.rcUpload

import typings.rcUpload.anon.RcFilewebkitRelativePaths
import typings.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverseFileTreeMod {
  
  @JSImport("rc-upload/es/traverseFileTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(files: js.Array[InternalDataTransferItem], callback: js.Any, isAccepted: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], isAccepted.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait InternalDataTransferItem
    extends StObject
       with DataTransferItem {
    
    def createReader(): js.Any = js.native
    
    def file(cd: js.Function1[/* file */ RcFilewebkitRelativePaths, Unit]): Unit = js.native
    
    var fullPath: String = js.native
    
    var isDirectory: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var name: String = js.native
    
    var path: String = js.native
  }
}
