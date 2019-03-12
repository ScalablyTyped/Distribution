package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyBase extends js.Object {
  def Clone(): IPropertyBase
  def GetData(): js.Any
  def GetLocalized(): java.lang.String
  def HasDataValue(): scala.Boolean
  def HasLocalizedValue(): scala.Boolean
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: java.lang.String): scala.Unit
}

object IPropertyBase {
  @scala.inline
  def apply(
    Clone: () => IPropertyBase,
    GetData: () => js.Any,
    GetLocalized: () => java.lang.String,
    HasDataValue: () => scala.Boolean,
    HasLocalizedValue: () => scala.Boolean,
    Update: (js.Any, java.lang.String) => scala.Unit
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetData = js.Any.fromFunction0(GetData), GetLocalized = js.Any.fromFunction0(GetLocalized), HasDataValue = js.Any.fromFunction0(HasDataValue), HasLocalizedValue = js.Any.fromFunction0(HasLocalizedValue), Update = js.Any.fromFunction2(Update))
  
    __obj.asInstanceOf[IPropertyBase]
  }
}

