package typings.senchaTouch.Ext.device.filesystem

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntry extends IBase {
  /** [Method] Works the same way as moveTo but copies the entry
    * @param config Object
    */
  var copyTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the file system on which the entry resides
    * @returns Ext.device.filesystem.FileSystem The entry file system.
    */
  var getFileSystem: js.UndefOr[js.Function0[IFileSystem]] = js.native
  /** [Method] Returns the full absolute path from the root to the entry
    * @returns String The entry full path.
    */
  var getFullPath: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the name of the entry excluding the path leading to it
    * @returns String The entry name.
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Looks up the parent directory containing the entry
    * @param config Object The object which contains the following config options:
    */
  var getParent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns whether the entry is a directory
    * @returns Boolean The entry is a directory.
    */
  var isDirectory: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns whether the entry is a file
    * @returns Boolean The entry is a file.
    */
  var isFile: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Moves the entry to a different location on the file system
    * @param config Object The object which contains the following config options:
    */
  var moveTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes the entry from the file system
    * @param config Object The object which contains the following config options:
    */
  var remove: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IEntry {
  @scala.inline
  def apply(): IEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntry]
  }
  @scala.inline
  implicit class IEntryOps[Self <: IEntry] (val x: Self) extends AnyVal {
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
    def setCopyTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("copyTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCopyTo: Self = this.set("copyTo", js.undefined)
    @scala.inline
    def setGetFileSystem(value: () => IFileSystem): Self = this.set("getFileSystem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFileSystem: Self = this.set("getFileSystem", js.undefined)
    @scala.inline
    def setGetFullPath(value: () => String): Self = this.set("getFullPath", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFullPath: Self = this.set("getFullPath", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetParent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getParent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetParent: Self = this.set("getParent", js.undefined)
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
    @scala.inline
    def setMoveTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("moveTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveTo: Self = this.set("moveTo", js.undefined)
    @scala.inline
    def setRemove(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
  
}

