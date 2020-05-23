package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLink extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_hidden(): Boolean = js.native
  def get_id(): Guid = js.native
  def get_name(): String = js.native
  def get_required(): Boolean = js.native
  def set_hidden(value: Boolean): Unit = js.native
  def set_required(value: Boolean): Unit = js.native
}

