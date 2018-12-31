package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectProps[OptionType] extends js.Object {
  var clearValue: js.Function0[scala.Unit]
  var cx: js.Any
  var getStyles: js.Function2[/* key */ java.lang.String, /* props */ js.Object, js.Object]
  var getValue: js.Function0[js.Array[OptionType]]
  var hasValue: scala.Boolean
  var isMulti: scala.Boolean
  var isRtl: scala.Boolean
  var options: reactDashSelectLib.libTypesMod.OptionsType[_]
  var selectOption: js.Function1[/* newValue */ OptionType, scala.Unit]
  var selectProps: stdLib.Readonly[Anon_ChildrenReactNode] with stdLib.Readonly[reactDashSelectLib.libSelectMod.Props[OptionType]]
  var setValue: js.Function3[
    /* newValue */ reactDashSelectLib.libTypesMod.ValueType[OptionType], 
    /* action */ reactDashSelectLib.libTypesMod.ActionTypes, 
    /* option */ js.UndefOr[OptionType], 
    scala.Unit
  ]
}

