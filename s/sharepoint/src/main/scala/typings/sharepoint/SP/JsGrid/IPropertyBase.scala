package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyBase extends js.Object {
  def Clone(): IPropertyBase
  def GetData(): js.Any
  def GetLocalized(): String
  def HasDataValue(): Boolean
  def HasLocalizedValue(): Boolean
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: String): Unit
}

object IPropertyBase {
  @scala.inline
  def apply(
    Clone: () => IPropertyBase,
    GetData: () => js.Any,
    GetLocalized: () => String,
    HasDataValue: () => Boolean,
    HasLocalizedValue: () => Boolean,
    Update: (js.Any, String) => Unit
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetData = js.Any.fromFunction0(GetData), GetLocalized = js.Any.fromFunction0(GetLocalized), HasDataValue = js.Any.fromFunction0(HasDataValue), HasLocalizedValue = js.Any.fromFunction0(HasLocalizedValue), Update = js.Any.fromFunction2(Update))
    __obj.asInstanceOf[IPropertyBase]
  }
}

