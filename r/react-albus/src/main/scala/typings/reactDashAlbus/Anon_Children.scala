package typings.reactDashAlbus

import typings.react.reactMod.ReactNode
import typings.reactDashAlbus.reactDashAlbusMod.WizardContext
import typings.reactDashAlbus.reactDashAlbusMod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends WizardContextRenderProps {
  def children(wizard: WizardContext): ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(children: WizardContext => ReactNode): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

