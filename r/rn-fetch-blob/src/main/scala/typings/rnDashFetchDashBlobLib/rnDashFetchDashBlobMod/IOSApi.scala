package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSApi extends js.Object {
  /**
    * Show options menu for interact with the file.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def openDocument(path: java.lang.String): scala.Unit
  /**
    * Open a file in {@link https://developer.apple.com/reference/uikit/uidocumentinteractioncontroller UIDocumentInteractionController},
    * this is the default document viewer of iOS, supports several kinds of files. On Android, there's an similar method {@link android.actionViewIntent}.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def previewDocument(path: java.lang.String): scala.Unit
}

object IOSApi {
  @scala.inline
  def apply(openDocument: java.lang.String => scala.Unit, previewDocument: java.lang.String => scala.Unit): IOSApi = {
    val __obj = js.Dynamic.literal(openDocument = js.Any.fromFunction1(openDocument), previewDocument = js.Any.fromFunction1(previewDocument))
  
    __obj.asInstanceOf[IOSApi]
  }
}

