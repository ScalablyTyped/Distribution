package typings.reactHelmetWithVisor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetProps extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var base: js.UndefOr[js.Any] = js.native
  var bodyAttributes: js.UndefOr[BodyProps] = js.native
  var defaultTitle: js.UndefOr[String] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var encodeSpecialCharacters: js.UndefOr[Boolean] = js.native
  var htmlAttributes: js.UndefOr[HtmlProps] = js.native
  var link: js.UndefOr[js.Array[LinkProps]] = js.native
  var meta: js.UndefOr[js.Array[MetaProps]] = js.native
  var noscript: js.UndefOr[js.Array[_]] = js.native
  var onChangeClientState: js.UndefOr[
    js.Function3[/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags, Unit]
  ] = js.native
  var script: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Array[_]] = js.native
  var title: js.UndefOr[String] = js.native
  var titleAttributes: js.UndefOr[js.Object] = js.native
  var titleTemplate: js.UndefOr[String] = js.native
}

object HelmetProps {
  @scala.inline
  def apply(): HelmetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelmetProps]
  }
  @scala.inline
  implicit class HelmetPropsOps[Self <: HelmetProps] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBase(value: js.Any): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBodyAttributes(value: BodyProps): Self = this.set("bodyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyAttributes: Self = this.set("bodyAttributes", js.undefined)
    @scala.inline
    def setDefaultTitle(value: String): Self = this.set("defaultTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTitle: Self = this.set("defaultTitle", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setEncodeSpecialCharacters(value: Boolean): Self = this.set("encodeSpecialCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeSpecialCharacters: Self = this.set("encodeSpecialCharacters", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: HtmlProps): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setLinkVarargs(value: LinkProps*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[LinkProps]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setMetaVarargs(value: MetaProps*): Self = this.set("meta", js.Array(value :_*))
    @scala.inline
    def setMeta(value: js.Array[MetaProps]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setNoscriptVarargs(value: js.Any*): Self = this.set("noscript", js.Array(value :_*))
    @scala.inline
    def setNoscript(value: js.Array[_]): Self = this.set("noscript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoscript: Self = this.set("noscript", js.undefined)
    @scala.inline
    def setOnChangeClientState(value: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit): Self = this.set("onChangeClientState", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChangeClientState: Self = this.set("onChangeClientState", js.undefined)
    @scala.inline
    def setScriptVarargs(value: js.Any*): Self = this.set("script", js.Array(value :_*))
    @scala.inline
    def setScript(value: js.Array[_]): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setStyleVarargs(value: js.Any*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: js.Array[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAttributes(value: js.Object): Self = this.set("titleAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAttributes: Self = this.set("titleAttributes", js.undefined)
    @scala.inline
    def setTitleTemplate(value: String): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
  }
  
}

