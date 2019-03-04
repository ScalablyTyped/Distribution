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
    Clone: js.Function0[IPropertyBase],
    GetData: js.Function0[js.Any],
    GetLocalized: js.Function0[java.lang.String],
    HasDataValue: js.Function0[scala.Boolean],
    HasLocalizedValue: js.Function0[scala.Boolean],
    Update: js.Function2[js.Any, java.lang.String, scala.Unit]
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = Clone, GetData = GetData, GetLocalized = GetLocalized, HasDataValue = HasDataValue, HasLocalizedValue = HasLocalizedValue, Update = Update)
  
    __obj.asInstanceOf[IPropertyBase]
  }
}

