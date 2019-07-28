package typings.reactDashForm

import typings.reactDashForm.reactDashFormMod.FieldApi
import typings.reactDashForm.reactDashFormMod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.undefined
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(children: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn = null): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

