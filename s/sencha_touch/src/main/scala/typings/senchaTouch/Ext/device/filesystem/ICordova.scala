package typings.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICordova extends IHTML5 {
  /** [Method] Downloads a file from the server saving it into the Local File System
    * @param config Object
    * @returns FileTransfer
    */
  var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Method]
    * @param config Object
    */
  var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Send a file to a server
    * @param config Object
    * @returns FileTransfer
    */
  var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Method]
    * @param config Object
    */
  var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICordova {
  @scala.inline
  def apply(): ICordova = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordova]
  }
  @scala.inline
  implicit class ICordovaOps[Self <: ICordova] (val x: Self) extends AnyVal {
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
    def setDownload(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("download", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setReadMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("readMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReadMetadata: Self = this.set("readMetadata", js.undefined)
    @scala.inline
    def setUpload(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("upload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    @scala.inline
    def setWriteMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("writeMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWriteMetadata: Self = this.set("writeMetadata", js.undefined)
  }
  
}

