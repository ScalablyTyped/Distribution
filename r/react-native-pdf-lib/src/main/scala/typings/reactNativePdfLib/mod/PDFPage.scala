package typings.reactNativePdfLib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-pdf-lib", "PDFPage")
@js.native
class PDFPage () extends js.Object {
  def drawImage(imageUri: String): PDFPage = js.native
  def drawImage(imageUri: String, options: ImageDrawingOptions): PDFPage = js.native
  def drawRectangle(): PDFPage = js.native
  def drawRectangle(options: RectangleDrawingOptions): PDFPage = js.native
  def drawText(text: String): PDFPage = js.native
  def drawText(text: String, options: TextDrawingOptions): PDFPage = js.native
  def setMediaBox(width: Double, height: Double): PDFPage = js.native
  def setMediaBox(width: Double, height: Double, options: SetMediaBoxOptions): PDFPage = js.native
}

/* static members */
@JSImport("react-native-pdf-lib", "PDFPage")
@js.native
object PDFPage extends js.Object {
  def create(): PDFPage = js.native
}

