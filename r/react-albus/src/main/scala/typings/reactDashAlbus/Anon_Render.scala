package typings.reactDashAlbus

import typings.react.reactMod.ReactNode
import typings.reactDashAlbus.reactDashAlbusMod.WizardContext
import typings.reactDashAlbus.reactDashAlbusMod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.undefined
}

object Anon_Render {
  @scala.inline
  def apply(render: /* wizard */ WizardContext => ReactNode = null): Anon_Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Anon_Render]
  }
}

