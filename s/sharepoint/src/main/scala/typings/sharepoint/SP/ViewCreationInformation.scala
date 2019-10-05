package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ViewCreationInformation")
@js.native
class ViewCreationInformation () extends ClientValueObject {
  def get_paged(): Boolean = js.native
  def get_personalView(): Boolean = js.native
  def get_query(): String = js.native
  def get_rowLimit(): Double = js.native
  def get_setAsDefaultView(): Boolean = js.native
  def get_title(): String = js.native
  def get_viewFields(): js.Array[String] = js.native
  def get_viewTypeKind(): ViewType = js.native
  def set_paged(value: Boolean): Unit = js.native
  def set_personalView(value: Boolean): Unit = js.native
  def set_query(value: String): Unit = js.native
  def set_rowLimit(value: Double): Unit = js.native
  def set_setAsDefaultView(value: Boolean): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_viewFields(value: js.Array[String]): Unit = js.native
  def set_viewTypeKind(value: ViewType): Unit = js.native
}

