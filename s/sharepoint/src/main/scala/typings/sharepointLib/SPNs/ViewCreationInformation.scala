package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ViewCreationInformation")
@js.native
class ViewCreationInformation () extends ClientValueObject {
  def get_paged(): scala.Boolean = js.native
  def get_personalView(): scala.Boolean = js.native
  def get_query(): java.lang.String = js.native
  def get_rowLimit(): scala.Double = js.native
  def get_setAsDefaultView(): scala.Boolean = js.native
  def get_title(): java.lang.String = js.native
  def get_viewFields(): js.Array[java.lang.String] = js.native
  def get_viewTypeKind(): ViewType = js.native
  def set_paged(value: scala.Boolean): scala.Unit = js.native
  def set_personalView(value: scala.Boolean): scala.Unit = js.native
  def set_query(value: java.lang.String): scala.Unit = js.native
  def set_rowLimit(value: scala.Double): scala.Unit = js.native
  def set_setAsDefaultView(value: scala.Boolean): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_viewFields(value: js.Array[java.lang.String]): scala.Unit = js.native
  def set_viewTypeKind(value: ViewType): scala.Unit = js.native
}

