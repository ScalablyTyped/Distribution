package typings.rcUpload

import typings.rcUpload.anon.RcFilewebkitRelativePaths
import typings.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-upload/es/traverseFileTree", JSImport.Namespace)
@js.native
object traverseFileTreeMod extends js.Object {
  
  def default(files: js.Array[InternalDataTransferItem], callback: js.Any, isAccepted: js.Any): Unit = js.native
  
  @js.native
  trait InternalDataTransferItem extends DataTransferItem {
    
    def createReader(): js.Any = js.native
    
    def file(cd: js.Function1[/* file */ RcFilewebkitRelativePaths, Unit]): Unit = js.native
    
    var fullPath: String = js.native
    
    var isDirectory: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var name: String = js.native
    
    var path: String = js.native
  }
}
