package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewFieldCollection
  extends ClientObjectCollection[java.lang.String] {
  def add(strField: java.lang.String): scala.Unit = js.native
  def get_item(index: scala.Double): java.lang.String = js.native
  def get_schemaXml(): java.lang.String = js.native
  def itemAt(index: scala.Double): java.lang.String = js.native
  def moveFieldTo(field: java.lang.String, index: scala.Double): scala.Unit = js.native
  def remove(strField: java.lang.String): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
}

