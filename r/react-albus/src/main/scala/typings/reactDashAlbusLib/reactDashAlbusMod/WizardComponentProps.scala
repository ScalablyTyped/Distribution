package typings
package reactDashAlbusLib.reactDashAlbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardComponentProps extends js.Object {
  var wizard: WizardContext
}

object WizardComponentProps {
  @scala.inline
  def apply(wizard: WizardContext): WizardComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wizard")(wizard)
    __obj.asInstanceOf[WizardComponentProps]
  }
}

