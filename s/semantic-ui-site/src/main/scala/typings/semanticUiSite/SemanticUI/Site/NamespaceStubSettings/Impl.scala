package typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var cache: js.Any = js.native
  var config: js.Any = js.native
  var section: js.Any = js.native
  var sections: js.Any = js.native
  var utilities: js.Any = js.native
}

object Impl {
  @scala.inline
  def apply(cache: js.Any, config: js.Any, section: js.Any, sections: js.Any, utilities: js.Any): Impl = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], utilities = utilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection(value: js.Any): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def setSections(value: js.Any): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtilities(value: js.Any): Self = this.set("utilities", value.asInstanceOf[js.Any])
  }
  
}

