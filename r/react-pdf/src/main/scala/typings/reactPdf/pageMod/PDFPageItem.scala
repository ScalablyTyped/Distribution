package typings.reactPdf.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageItem extends js.Object {
  var _transport: js.Object = js.native
  var commonObjs: js.Object = js.native
  def getAnnotations(args: js.Any*): js.Any = js.native
  def getTextContent(args: js.Any*): js.Any = js.native
  def getViewport(args: js.Any*): js.Any = js.native
  def render(args: js.Any*): js.Any = js.native
}

object PDFPageItem {
  @scala.inline
  def apply(
    _transport: js.Object,
    commonObjs: js.Object,
    getAnnotations: /* repeated */ js.Any => js.Any,
    getTextContent: /* repeated */ js.Any => js.Any,
    getViewport: /* repeated */ js.Any => js.Any,
    render: /* repeated */ js.Any => js.Any
  ): PDFPageItem = {
    val __obj = js.Dynamic.literal(_transport = _transport.asInstanceOf[js.Any], commonObjs = commonObjs.asInstanceOf[js.Any], getAnnotations = js.Any.fromFunction1(getAnnotations), getTextContent = js.Any.fromFunction1(getTextContent), getViewport = js.Any.fromFunction1(getViewport), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[PDFPageItem]
  }
  @scala.inline
  implicit class PDFPageItemOps[Self <: PDFPageItem] (val x: Self) extends AnyVal {
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
    def set_transport(value: js.Object): Self = this.set("_transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonObjs(value: js.Object): Self = this.set("commonObjs", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAnnotations(value: /* repeated */ js.Any => js.Any): Self = this.set("getAnnotations", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTextContent(value: /* repeated */ js.Any => js.Any): Self = this.set("getTextContent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetViewport(value: /* repeated */ js.Any => js.Any): Self = this.set("getViewport", js.Any.fromFunction1(value))
    @scala.inline
    def setRender(value: /* repeated */ js.Any => js.Any): Self = this.set("render", js.Any.fromFunction1(value))
  }
  
}

