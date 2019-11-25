package typings.reactDashAlbus.reactDashAlbusMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashAlbus.Anon_Render
  - typings.reactDashAlbus.Anon_Children
*/
trait WizardContextRenderProps extends js.Object

object WizardContextRenderProps {
  @scala.inline
  def Anon_Render(render: /* wizard */ WizardContext => ReactNode = null): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
  @scala.inline
  def Anon_Children(children: WizardContext => ReactNode): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WizardContextRenderProps]
  }
}

