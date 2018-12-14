package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name

trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: scala.Boolean
  /** Please use SetProp and GetProp */
  var properties: org.scalablytyped.runtime.StringDictionary[IPropertyBase]
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: java.lang.String, value: js.Any): scala.Unit
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: java.lang.String): js.Any
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: java.lang.String): java.lang.String
  def GetProp(fieldKey: java.lang.String): IPropertyBase
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: java.lang.String): scala.Boolean
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: java.lang.String): scala.Boolean
  /** Removes value of the specified field.
                  Does not refresh the view. */
  def RemoveFieldValue(fieldKey: java.lang.String): scala.Unit
  def SetProp(fieldKey: java.lang.String, prop: IPropertyBase): scala.Unit
  /** returns recordKey */
  def key(): scala.Double
}

