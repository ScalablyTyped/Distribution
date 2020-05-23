package typings.reactAlbus.anon

import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.undefined
}

object Render {
  @scala.inline
  def apply(render: /* wizard */ WizardContext => ReactNode = null): Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Render]
  }
}

