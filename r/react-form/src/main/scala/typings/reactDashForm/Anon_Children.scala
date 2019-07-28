package typings.reactDashForm

import typings.reactDashForm.reactDashFormMod.FormFunctionProps
import typings.reactDashForm.reactDashFormMod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: (js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

