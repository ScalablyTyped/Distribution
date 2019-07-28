package typings.reactDashPdf.distPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageItem extends js.Object {
  var _transport: js.Object
  var commonObjs: js.Object
  def getAnnotations(args: js.Any*): js.Any
  def getTextContent(args: js.Any*): js.Any
  def getViewport(args: js.Any*): js.Any
  def render(args: js.Any*): js.Any
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
    val __obj = js.Dynamic.literal(_transport = _transport, commonObjs = commonObjs, getAnnotations = js.Any.fromFunction1(getAnnotations), getTextContent = js.Any.fromFunction1(getTextContent), getViewport = js.Any.fromFunction1(getViewport), render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[PDFPageItem]
  }
}

