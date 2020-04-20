package typings.reactAlbus

import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends WizardContextRenderProps {
  def children(wizard: WizardContext): ReactNode
}

object AnonChildren {
  @scala.inline
  def apply(children: WizardContext => ReactNode): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren]
  }
}

