package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action[OptionType] extends js.Object {
  var cx: js.Any = js.native
  var hasValue: scala.Boolean = js.native
  var isMulti: scala.Boolean = js.native
  var isRtl: scala.Boolean = js.native
  var options: reactDashSelectLib.srcTypesMod.OptionsType[_] = js.native
  var selectProps: Anon_Children with reactDashSelectLib.srcSelectMod.Props[OptionType] = js.native
  def clearValue(): scala.Unit = js.native
  def getStyles(key: java.lang.String, props: js.Object): js.Object = js.native
  def getValue(): js.Array[OptionType] = js.native
  def selectOption(newValue: OptionType): scala.Unit = js.native
  def setValue(
    newValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    action: reactDashSelectLib.srcTypesMod.ActionTypes
  ): scala.Unit = js.native
  def setValue(
    newValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType],
    action: reactDashSelectLib.srcTypesMod.ActionTypes,
    option: OptionType
  ): scala.Unit = js.native
}

