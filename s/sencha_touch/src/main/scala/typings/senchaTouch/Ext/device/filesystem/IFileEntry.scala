package typings.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileEntry extends IEntry {
  
  /** [Method] Requests a File Handle from the Local File System
    * @param config Object
    */
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the byte offset into the file at which the next read write will occur
    * @returns Number The file offset.
    */
  var getOffset: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Reads the data from the file starting at the file offset
    * @param config Object The object which contains the following config options:
    */
  var read: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the byte offset into the file at which the next read write will occur
    * @param config Object The object which contains the following config options:
    */
  var seek: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Truncates or extends the file to the specified size in bytes
    * @param config Object The object which contains the following config options:
    */
  var truncate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Writes the data to the file starting at the file offset
    * @param config Object The object which contains the following config options:
    */
  var write: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}
object IFileEntry {
  
  @scala.inline
  def apply(): IFileEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileEntry]
  }
  
  @scala.inline
  implicit class IFileEntryOps[Self <: IFileEntry] (val x: Self) extends AnyVal {
    
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
    def setGetEntry(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEntry: Self = this.set("getEntry", js.undefined)
    
    @scala.inline
    def setGetOffset(value: () => Double): Self = this.set("getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffset: Self = this.set("getOffset", js.undefined)
    
    @scala.inline
    def setRead(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSeek(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeek: Self = this.set("seek", js.undefined)
    
    @scala.inline
    def setTruncate(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("truncate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    
    @scala.inline
    def setWrite(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
