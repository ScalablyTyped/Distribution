package typings
package reactDashAlbusLib.reactDashAlbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardProps extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var history: js.UndefOr[historyLib.historyMod.History[historyLib.historyMod.LocationState]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

object WizardProps {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState] = null,
    onNext: js.Function1[/* wizard */ WizardContext, scala.Unit] = null,
    render: js.Function1[/* wizard */ WizardContext, reactLib.reactMod.ReactNs.ReactNode] = null
  ): WizardProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (history != null) __obj.updateDynamic("history")(history)
    if (onNext != null) __obj.updateDynamic("onNext")(onNext)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[WizardProps]
  }
}

