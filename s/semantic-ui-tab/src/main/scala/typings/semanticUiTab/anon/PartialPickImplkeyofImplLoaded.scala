package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplLoaded extends js.Object {
  var loaded: js.UndefOr[String] = js.native
  var promise: js.UndefOr[String] = js.native
  var tab: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplLoaded {
  @scala.inline
  def apply(): PartialPickImplkeyofImplLoaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplLoaded]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplLoadedOps[Self <: PartialPickImplkeyofImplLoaded] (val x: Self) extends AnyVal {
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
    def setLoaded(value: String): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setPromise(value: String): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
  
}

