package typings.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'modules'> */
@js.native
trait PickImplmodules extends js.Object {
  var modules: js.Array[String] = js.native
}

object PickImplmodules {
  @scala.inline
  def apply(modules: js.Array[String]): PickImplmodules = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmodules]
  }
  @scala.inline
  implicit class PickImplmodulesOps[Self <: PickImplmodules] (val x: Self) extends AnyVal {
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
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
  }
  
}

