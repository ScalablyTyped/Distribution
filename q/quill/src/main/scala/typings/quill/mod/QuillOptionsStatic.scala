package typings.quill.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuillOptionsStatic extends js.Object {
  var bounds: js.UndefOr[HTMLElement | String] = js.native
  var debug: js.UndefOr[String | Boolean] = js.native
  var formats: js.UndefOr[js.Array[String]] = js.native
  var modules: js.UndefOr[StringMap] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var scrollingContainer: js.UndefOr[HTMLElement | String] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object QuillOptionsStatic {
  @scala.inline
  def apply(): QuillOptionsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuillOptionsStatic]
  }
  @scala.inline
  implicit class QuillOptionsStaticOps[Self <: QuillOptionsStatic] (val x: Self) extends AnyVal {
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
    def setBounds(value: HTMLElement | String): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setDebug(value: String | Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: String*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[String]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setModules(value: StringMap): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setScrollingContainer(value: HTMLElement | String): Self = this.set("scrollingContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollingContainer: Self = this.set("scrollingContainer", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

