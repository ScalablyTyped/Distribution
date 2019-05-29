package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps[OptionType] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.native
  var hasValue: scala.Boolean = js.native
  var isMulti: scala.Boolean = js.native
  var options: OptionsType[OptionType] = js.native
  var selectProps: reactDashSelectLib.libSelectMod.Props[OptionType] = js.native
  def clearValue(): scala.Unit = js.native
  def cx(): java.lang.String | scala.Unit = js.native
  def cx(a: java.lang.String): java.lang.String | scala.Unit = js.native
  def cx(a: java.lang.String, b: js.UndefOr[ClassNamesState], c: java.lang.String): java.lang.String | scala.Unit = js.native
  def cx(a: java.lang.String, b: ClassNamesState): java.lang.String | scala.Unit = js.native
  def cx(a: scala.Null, b: js.UndefOr[ClassNamesState], c: java.lang.String): java.lang.String | scala.Unit = js.native
  def cx(a: scala.Null, b: ClassNamesState): java.lang.String | scala.Unit = js.native
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: java.lang.String, props: js.Any): js.Object = js.native
  def getValue(): ValueType[OptionType] = js.native
  def selectOption(option: OptionType): scala.Unit = js.native
  def setValue(value: ValueType[OptionType], action: ActionTypes): scala.Unit = js.native
}

