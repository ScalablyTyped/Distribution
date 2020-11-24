package typings.senchaTouch.Ext.device.filesystem

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileSystem extends IBase {
  
  /** [Method] Returns a Ext device filesystem DirectoryEntry instance for the root of the file system
    * @returns Ext.device.filesystem.DirectoryEntry The file system root directory.
    */
  var getRoot: js.UndefOr[js.Function0[IDirectoryEntry]] = js.native
}
object IFileSystem {
  
  @scala.inline
  def apply(): IFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileSystem]
  }
  
  @scala.inline
  implicit class IFileSystemOps[Self <: IFileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRoot(value: () => IDirectoryEntry): Self = this.set("getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRoot: Self = this.set("getRoot", js.undefined)
  }
}
