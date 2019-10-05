package typings.storybookDashReadme.storybookDashReadmeMod

import typings.react.reactMod.Global.JSX.Element
import typings.storybookDashReadme.Anon_ChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[js.Function1[/* props */ Anon_ChildrenElement, Element]] = js.undefined
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ Anon_ChildrenElement, Element]] = js.undefined
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: /* props */ Anon_ChildrenElement => Element = null,
    PreviewComponent: /* props */ Anon_ChildrenElement => Element = null
  ): CustomComponents = {
    val __obj = js.Dynamic.literal()
    if (FooterComponent != null) __obj.updateDynamic("FooterComponent")(js.Any.fromFunction1(FooterComponent))
    if (PreviewComponent != null) __obj.updateDynamic("PreviewComponent")(js.Any.fromFunction1(PreviewComponent))
    __obj.asInstanceOf[CustomComponents]
  }
}

