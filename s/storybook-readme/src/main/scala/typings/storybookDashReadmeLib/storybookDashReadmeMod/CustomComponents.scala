package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_ChildrenElement, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var PreviewComponent: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_ChildrenElement, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: /* props */ storybookDashReadmeLib.Anon_ChildrenElement => reactLib.reactMod.Global.JSXNs.Element = null,
    PreviewComponent: /* props */ storybookDashReadmeLib.Anon_ChildrenElement => reactLib.reactMod.Global.JSXNs.Element = null
  ): CustomComponents = {
    val __obj = js.Dynamic.literal()
    if (FooterComponent != null) __obj.updateDynamic("FooterComponent")(js.Any.fromFunction1(FooterComponent))
    if (PreviewComponent != null) __obj.updateDynamic("PreviewComponent")(js.Any.fromFunction1(PreviewComponent))
    __obj.asInstanceOf[CustomComponents]
  }
}

