package typings.reactJss.mod

import typings.jss.mod.StyleSheetFactoryOptions
import typings.theming.mod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions[Theme] extends StyleSheetFactoryOptions {
  var theming: js.UndefOr[Theming[Theme]] = js.native
}

object BaseOptions {
  @scala.inline
  def apply[Theme](): BaseOptions[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions[Theme]]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions[_], Theme] (val x: Self with BaseOptions[Theme]) extends AnyVal {
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
    def setTheming(value: Theming[Theme]): Self = this.set("theming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheming: Self = this.set("theming", js.undefined)
  }
  
}

