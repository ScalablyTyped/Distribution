package typings.reactForm

import typings.reactForm.mod.FieldApi
import typings.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.undefined
}

object AnonChildrenProps {
  @scala.inline
  def apply(children: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn = null): AnonChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenProps]
  }
}

