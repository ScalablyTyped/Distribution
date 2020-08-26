package typings.reactHelmet.mod

import typings.std.HTMLLinkElement
import typings.std.HTMLMetaElement
import typings.std.HTMLScriptElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetTags extends js.Object {
  var baseTag: js.Array[_] = js.native
  var linkTags: js.Array[HTMLLinkElement] = js.native
  var metaTags: js.Array[HTMLMetaElement] = js.native
  var noscriptTags: js.Array[_] = js.native
  var scriptTags: js.Array[HTMLScriptElement] = js.native
  var styleTags: js.Array[HTMLStyleElement] = js.native
}

object HelmetTags {
  @scala.inline
  def apply(
    baseTag: js.Array[_],
    linkTags: js.Array[HTMLLinkElement],
    metaTags: js.Array[HTMLMetaElement],
    noscriptTags: js.Array[_],
    scriptTags: js.Array[HTMLScriptElement],
    styleTags: js.Array[HTMLStyleElement]
  ): HelmetTags = {
    val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetTags]
  }
  @scala.inline
  implicit class HelmetTagsOps[Self <: HelmetTags] (val x: Self) extends AnyVal {
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
    def setBaseTagVarargs(value: js.Any*): Self = this.set("baseTag", js.Array(value :_*))
    @scala.inline
    def setBaseTag(value: js.Array[_]): Self = this.set("baseTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkTagsVarargs(value: HTMLLinkElement*): Self = this.set("linkTags", js.Array(value :_*))
    @scala.inline
    def setLinkTags(value: js.Array[HTMLLinkElement]): Self = this.set("linkTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaTagsVarargs(value: HTMLMetaElement*): Self = this.set("metaTags", js.Array(value :_*))
    @scala.inline
    def setMetaTags(value: js.Array[HTMLMetaElement]): Self = this.set("metaTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoscriptTagsVarargs(value: js.Any*): Self = this.set("noscriptTags", js.Array(value :_*))
    @scala.inline
    def setNoscriptTags(value: js.Array[_]): Self = this.set("noscriptTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptTagsVarargs(value: HTMLScriptElement*): Self = this.set("scriptTags", js.Array(value :_*))
    @scala.inline
    def setScriptTags(value: js.Array[HTMLScriptElement]): Self = this.set("scriptTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleTagsVarargs(value: HTMLStyleElement*): Self = this.set("styleTags", js.Array(value :_*))
    @scala.inline
    def setStyleTags(value: js.Array[HTMLStyleElement]): Self = this.set("styleTags", value.asInstanceOf[js.Any])
  }
  
}

