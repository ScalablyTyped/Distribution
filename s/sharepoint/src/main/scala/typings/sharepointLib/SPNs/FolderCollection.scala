package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderCollection extends ClientObjectCollection[Folder] {
  def add(url: java.lang.String): Folder = js.native
  def getByUrl(url: java.lang.String): Folder = js.native
  def get_item(index: scala.Double): Folder = js.native
  def itemAt(index: scala.Double): Folder = js.native
}

