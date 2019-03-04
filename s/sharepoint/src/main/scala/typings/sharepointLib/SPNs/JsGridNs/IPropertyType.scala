package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyType extends js.Object {
  var ID: java.lang.String
  def BeginValidateNormalizeConvert(
    recordKey: scala.Double,
    fieldKey: java.lang.String,
    newValue: js.Any,
    bIsLocalized: scala.Boolean,
    fnCallback: js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit],
    fnError: js.Any
  ): scala.Unit
}

object IPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: js.Function6[
      scala.Double, 
      java.lang.String, 
      js.Any, 
      scala.Boolean, 
      js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit], 
      js.Any, 
      scala.Unit
    ],
    ID: java.lang.String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = BeginValidateNormalizeConvert, ID = ID)
  
    __obj.asInstanceOf[IPropertyType]
  }
}

