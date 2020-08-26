package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplParent extends js.Object {
  var parent: js.UndefOr[String] = js.native
  var tabs: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplParent {
  @scala.inline
  def apply(): PartialPickImplkeyofImplParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplParent]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplParentOps[Self <: PartialPickImplkeyofImplParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setTabs(value: String): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
  }
  
}

