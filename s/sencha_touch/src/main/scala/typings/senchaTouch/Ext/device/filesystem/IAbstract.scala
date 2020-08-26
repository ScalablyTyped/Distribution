package typings.senchaTouch.Ext.device.filesystem

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of fileSystemSize
    * @returns Number
    */
  var getFileSystemSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of fileSystemType
    * @returns Number
    */
  var getFileSystemType: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of readerType
    * @returns String
    */
  var getReaderType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of stringEncoding
    * @returns String
    */
  var getStringEncoding: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of fileSystemSize
    * @param fileSystemSize Number The new value.
    */
  var setFileSystemSize: js.UndefOr[js.Function1[/* fileSystemSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of fileSystemType
    * @param fileSystemType Number The new value.
    */
  var setFileSystemType: js.UndefOr[js.Function1[/* fileSystemType */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of readerType
    * @param readerType String The new value.
    */
  var setReaderType: js.UndefOr[js.Function1[/* readerType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of stringEncoding
    * @param stringEncoding String The new value.
    */
  var setStringEncoding: js.UndefOr[js.Function1[/* stringEncoding */ js.UndefOr[String], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetFileSystemSize(value: () => Double): Self = this.set("getFileSystemSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFileSystemSize: Self = this.set("getFileSystemSize", js.undefined)
    @scala.inline
    def setGetFileSystemType(value: () => Double): Self = this.set("getFileSystemType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFileSystemType: Self = this.set("getFileSystemType", js.undefined)
    @scala.inline
    def setGetReaderType(value: () => String): Self = this.set("getReaderType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReaderType: Self = this.set("getReaderType", js.undefined)
    @scala.inline
    def setGetStringEncoding(value: () => String): Self = this.set("getStringEncoding", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStringEncoding: Self = this.set("getStringEncoding", js.undefined)
    @scala.inline
    def setSetFileSystemSize(value: /* fileSystemSize */ js.UndefOr[Double] => Unit): Self = this.set("setFileSystemSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFileSystemSize: Self = this.set("setFileSystemSize", js.undefined)
    @scala.inline
    def setSetFileSystemType(value: /* fileSystemType */ js.UndefOr[Double] => Unit): Self = this.set("setFileSystemType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFileSystemType: Self = this.set("setFileSystemType", js.undefined)
    @scala.inline
    def setSetReaderType(value: /* readerType */ js.UndefOr[String] => Unit): Self = this.set("setReaderType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReaderType: Self = this.set("setReaderType", js.undefined)
    @scala.inline
    def setSetStringEncoding(value: /* stringEncoding */ js.UndefOr[String] => Unit): Self = this.set("setStringEncoding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStringEncoding: Self = this.set("setStringEncoding", js.undefined)
  }
  
}

