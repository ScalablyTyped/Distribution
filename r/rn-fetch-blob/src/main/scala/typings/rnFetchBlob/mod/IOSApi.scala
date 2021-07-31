package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOSApi extends StObject {
  
  /**
    * Show options menu for interact with the file.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def openDocument(path: String): Unit
  
  /**
    * Open a file in {@link https://developer.apple.com/reference/uikit/uidocumentinteractioncontroller UIDocumentInteractionController},
    * this is the default document viewer of iOS, supports several kinds of files. On Android, there's an similar method {@link android.actionViewIntent}.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def previewDocument(path: String): Unit
}
object IOSApi {
  
  @scala.inline
  def apply(openDocument: String => Unit, previewDocument: String => Unit): IOSApi = {
    val __obj = js.Dynamic.literal(openDocument = js.Any.fromFunction1(openDocument), previewDocument = js.Any.fromFunction1(previewDocument))
    __obj.asInstanceOf[IOSApi]
  }
  
  @scala.inline
  implicit class IOSApiMutableBuilder[Self <: IOSApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenDocument(value: String => Unit): Self = StObject.set(x, "openDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviewDocument(value: String => Unit): Self = StObject.set(x, "previewDocument", js.Any.fromFunction1(value))
  }
}
