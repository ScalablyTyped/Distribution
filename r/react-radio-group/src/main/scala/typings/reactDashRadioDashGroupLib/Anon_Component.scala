package typings
package reactDashRadioDashGroupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactType[
      reactDashRadioDashGroupLib.reactDashRadioDashGroupMod.Omit[
        reactLib.reactMod.ReactNs.HTMLProps[_], 
        reactDashRadioDashGroupLib.reactDashRadioDashGroupLibStrings.onChange | reactDashRadioDashGroupLib.reactDashRadioDashGroupLibStrings.role
      ]
    ]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var selectedValue: js.UndefOr[js.Any] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(
    Component: reactLib.reactMod.ReactNs.ReactType[
      reactDashRadioDashGroupLib.reactDashRadioDashGroupMod.Omit[
        reactLib.reactMod.ReactNs.HTMLProps[_], 
        reactDashRadioDashGroupLib.reactDashRadioDashGroupLibStrings.onChange | reactDashRadioDashGroupLib.reactDashRadioDashGroupLibStrings.role
      ]
    ] = null,
    onChange: /* value */ js.Any => scala.Unit = null,
    selectedValue: js.Any = null
  ): Anon_Component = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue)
    __obj.asInstanceOf[Anon_Component]
  }
}

