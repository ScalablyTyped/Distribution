package typings.reactAlbus.anon

import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends WizardContextRenderProps {
  def children(wizard: WizardContext): ReactNode
}

object Children {
  @scala.inline
  def apply(children: WizardContext => ReactNode): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children]
  }
}

