package typings
package reactDashAlbusLib.reactDashAlbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardContextRenderProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* wizard */ WizardContext, reactLib.reactMod.ReactNode]] = js.undefined
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, reactLib.reactMod.ReactNode]] = js.undefined
}

object WizardContextRenderProps {
  @scala.inline
  def apply(
    children: /* wizard */ WizardContext => reactLib.reactMod.ReactNode = null,
    render: /* wizard */ WizardContext => reactLib.reactMod.ReactNode = null
  ): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
}

