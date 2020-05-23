package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewCreationInformation extends ClientValueObject {
  def get_paged(): Boolean
  def get_personalView(): Boolean
  def get_query(): String
  def get_rowLimit(): Double
  def get_setAsDefaultView(): Boolean
  def get_title(): String
  def get_viewFields(): js.Array[String]
  def get_viewTypeKind(): ViewType
  def set_paged(value: Boolean): Unit
  def set_personalView(value: Boolean): Unit
  def set_query(value: String): Unit
  def set_rowLimit(value: Double): Unit
  def set_setAsDefaultView(value: Boolean): Unit
  def set_title(value: String): Unit
  def set_viewFields(value: js.Array[String]): Unit
  def set_viewTypeKind(value: ViewType): Unit
}

object ViewCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_paged: () => Boolean,
    get_personalView: () => Boolean,
    get_query: () => String,
    get_rowLimit: () => Double,
    get_setAsDefaultView: () => Boolean,
    get_title: () => String,
    get_typeId: () => String,
    get_viewFields: () => js.Array[String],
    get_viewTypeKind: () => ViewType,
    set_paged: Boolean => Unit,
    set_personalView: Boolean => Unit,
    set_query: String => Unit,
    set_rowLimit: Double => Unit,
    set_setAsDefaultView: Boolean => Unit,
    set_title: String => Unit,
    set_viewFields: js.Array[String] => Unit,
    set_viewTypeKind: ViewType => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ViewCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_paged = js.Any.fromFunction0(get_paged), get_personalView = js.Any.fromFunction0(get_personalView), get_query = js.Any.fromFunction0(get_query), get_rowLimit = js.Any.fromFunction0(get_rowLimit), get_setAsDefaultView = js.Any.fromFunction0(get_setAsDefaultView), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_viewFields = js.Any.fromFunction0(get_viewFields), get_viewTypeKind = js.Any.fromFunction0(get_viewTypeKind), set_paged = js.Any.fromFunction1(set_paged), set_personalView = js.Any.fromFunction1(set_personalView), set_query = js.Any.fromFunction1(set_query), set_rowLimit = js.Any.fromFunction1(set_rowLimit), set_setAsDefaultView = js.Any.fromFunction1(set_setAsDefaultView), set_title = js.Any.fromFunction1(set_title), set_viewFields = js.Any.fromFunction1(set_viewFields), set_viewTypeKind = js.Any.fromFunction1(set_viewTypeKind), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ViewCreationInformation]
  }
}

