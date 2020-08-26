package typings.reactI18next.anon

import typings.i18next.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialLanguage extends js.Object {
  var initialI18nStore: Resource = js.native
  var initialLanguage: String = js.native
}

object InitialLanguage {
  @scala.inline
  def apply(initialI18nStore: Resource, initialLanguage: String): InitialLanguage = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialLanguage]
  }
  @scala.inline
  implicit class InitialLanguageOps[Self <: InitialLanguage] (val x: Self) extends AnyVal {
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
    def setInitialI18nStore(value: Resource): Self = this.set("initialI18nStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialLanguage(value: String): Self = this.set("initialLanguage", value.asInstanceOf[js.Any])
  }
  
}

