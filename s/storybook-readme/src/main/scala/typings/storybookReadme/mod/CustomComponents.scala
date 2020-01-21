package typings.storybookReadme.mod

import typings.react.mod._Global_.JSX.Element
import typings.storybookReadme.AnonChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, Element]] = js.undefined
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, Element]] = js.undefined
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: /* props */ AnonChildrenElement => Element = null,
    PreviewComponent: /* props */ AnonChildrenElement => Element = null
  ): CustomComponents = {
    val __obj = js.Dynamic.literal()
    if (FooterComponent != null) __obj.updateDynamic("FooterComponent")(js.Any.fromFunction1(FooterComponent))
    if (PreviewComponent != null) __obj.updateDynamic("PreviewComponent")(js.Any.fromFunction1(PreviewComponent))
    __obj.asInstanceOf[CustomComponents]
  }
}

