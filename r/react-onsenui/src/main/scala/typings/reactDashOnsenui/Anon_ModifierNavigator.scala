package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.Navigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModifierNavigator extends js.Object {
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* navigator */ Navigator, Unit]] = js.undefined
}

object Anon_ModifierNavigator {
  @scala.inline
  def apply(modifier: String = null, onClick: /* navigator */ Navigator => Unit = null): Anon_ModifierNavigator = {
    val __obj = js.Dynamic.literal()
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[Anon_ModifierNavigator]
  }
}

