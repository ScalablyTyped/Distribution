package typings.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectoryEntry extends IEntry {
  
  /** [Method] Works the same way as getFile but creates or looks up a directory
    * @param config Object
    */
  var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Requests a Directory from the Local File System
    * @param config Object
    */
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Creates or looks up a file
    * @param config Object The object which contains the following config options:
    */
  var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Lists all the entries in the directory
    * @param config Object The object which contains the following config options:
    */
  var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
    * @param config Object
    */
  var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDirectoryEntry {
  
  @scala.inline
  def apply(): IDirectoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectoryEntry]
  }
  
  @scala.inline
  implicit class IDirectoryEntryOps[Self <: IDirectoryEntry] (val x: Self) extends AnyVal {
    
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
    def setGetDirectory(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDirectory: Self = this.set("getDirectory", js.undefined)
    
    @scala.inline
    def setGetEntry(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEntry: Self = this.set("getEntry", js.undefined)
    
    @scala.inline
    def setGetFile(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFile: Self = this.set("getFile", js.undefined)
    
    @scala.inline
    def setReadEntries(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("readEntries", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadEntries: Self = this.set("readEntries", js.undefined)
    
    @scala.inline
    def setRemoveRecursively(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("removeRecursively", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveRecursively: Self = this.set("removeRecursively", js.undefined)
  }
}
