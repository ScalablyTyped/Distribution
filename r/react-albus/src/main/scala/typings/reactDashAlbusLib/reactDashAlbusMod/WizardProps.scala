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

