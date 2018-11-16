package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileVersionCollection extends ClientObjectCollection[FileVersion] {
  def deleteAll(): scala.Unit = js.native
  def deleteByID(vid: scala.Double): scala.Unit = js.native
  def deleteByLabel(versionlabel: java.lang.String): scala.Unit = js.native
  def getById(versionid: scala.Double): FileVersion = js.native
  def get_item(index: scala.Double): FileVersion = js.native
  def itemAt(index: scala.Double): FileVersion = js.native
  def restoreByLabel(versionlabel: java.lang.String): scala.Unit = js.native
}

