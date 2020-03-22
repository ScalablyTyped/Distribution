package typings.semanticUiTab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplParent extends js.Object {
  var parent: js.UndefOr[String] = js.undefined
  var tabs: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplParent {
  @scala.inline
  def apply(parent: String = null, tabs: String = null): PartialPickImplkeyofImplParent = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplParent]
  }
}

