package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCollection extends ClientObjectCollection[File] {
  def add(parameters: FileCreationInformation): File = js.native
  def addTemplateFile(urlOfFile: java.lang.String, templateFileType: TemplateFileType): File = js.native
  def getByUrl(url: java.lang.String): File = js.native
  def get_item(index: scala.Double): File = js.native
  def itemAt(index: scala.Double): File = js.native
}

