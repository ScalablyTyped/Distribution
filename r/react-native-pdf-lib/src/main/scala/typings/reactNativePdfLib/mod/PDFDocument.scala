package typings.reactNativePdfLib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-pdf-lib", "PDFDocument")
@js.native
class PDFDocument () extends js.Object {
  
  def addPages(pages: js.Array[PDFPage]): PDFDocument = js.native
  
  /* Saves the document and returns the path to the file it wrote */
  def write(): js.Promise[String] = js.native
}
/* static members */
@JSImport("react-native-pdf-lib", "PDFDocument")
@js.native
object PDFDocument extends js.Object {
  
  def create(path: String): PDFDocument = js.native
}
