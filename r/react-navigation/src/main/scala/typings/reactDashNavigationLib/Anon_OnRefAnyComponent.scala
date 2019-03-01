package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRefAnyComponent[T, P] extends js.Object {
  var onRef: js.UndefOr[
    reactLib.reactMod.ReactNs.Ref[
      reactLib.reactMod.Component[
        T with reactDashNavigationLib.reactDashNavigationMod.NavigationFocusInjectedProps[P], 
        js.Object, 
        _
      ]
    ]
  ] = js.undefined
}

object Anon_OnRefAnyComponent {
  @scala.inline
  def apply[T, P](
    onRef: reactLib.reactMod.ReactNs.Ref[
      reactLib.reactMod.Component[
        T with reactDashNavigationLib.reactDashNavigationMod.NavigationFocusInjectedProps[P], 
        js.Object, 
        _
      ]
    ] = null
  ): Anon_OnRefAnyComponent[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRefAnyComponent[T, P]]
  }
}

