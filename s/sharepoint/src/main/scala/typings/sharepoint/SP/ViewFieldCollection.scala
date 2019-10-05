package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewFieldCollection extends ClientObjectCollection[String] {
  def add(strField: String): Unit = js.native
  def get_item(index: Double): String = js.native
  def get_schemaXml(): String = js.native
  def itemAt(index: Double): String = js.native
  def moveFieldTo(field: String, index: Double): Unit = js.native
  def remove(strField: String): Unit = js.native
  def removeAll(): Unit = js.native
}

