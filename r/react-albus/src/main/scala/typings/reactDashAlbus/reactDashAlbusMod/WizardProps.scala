package typings.reactDashAlbus.reactDashAlbusMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardProps extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.undefined
}

object WizardProps {
  @scala.inline
  def apply(
    basename: String = null,
    history: History[LocationState] = null,
    onNext: /* wizard */ WizardContext => Unit = null,
    render: /* wizard */ WizardContext => ReactNode = null
  ): WizardProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (history != null) __obj.updateDynamic("history")(history)
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[WizardProps]
  }
}

