package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOSApi extends js.Object {
  
  /**
    * Show options menu for interact with the file.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def openDocument(path: String): Unit = js.native
  
  /**
    * Open a file in {@link https://developer.apple.com/reference/uikit/uidocumentinteractioncontroller UIDocumentInteractionController},
    * this is the default document viewer of iOS, supports several kinds of files. On Android, there's an similar method {@link android.actionViewIntent}.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def previewDocument(path: String): Unit = js.native
}
object IOSApi {
  
  @scala.inline
  def apply(openDocument: String => Unit, previewDocument: String => Unit): IOSApi = {
    val __obj = js.Dynamic.literal(openDocument = js.Any.fromFunction1(openDocument), previewDocument = js.Any.fromFunction1(previewDocument))
    __obj.asInstanceOf[IOSApi]
  }
  
  @scala.inline
  implicit class IOSApiOps[Self <: IOSApi] (val x: Self) extends AnyVal {
    
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
    def setOpenDocument(value: String => Unit): Self = this.set("openDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviewDocument(value: String => Unit): Self = this.set("previewDocument", js.Any.fromFunction1(value))
  }
}
