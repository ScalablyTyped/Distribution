package typings.reactForm

import typings.reactForm.mod.FormFunctionProps
import typings.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: (js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

