package typings.sanitizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISaxHandler extends js.Object {
  def cdata(text: String, param: js.Any): Unit
  def comment(text: String, param: js.Any): Unit
  def endDoc(param: js.Any): Unit
  def endTag(name: String, param: js.Any): Unit
  def pcdata(text: String, param: js.Any): Unit
  def rcdata(text: String, param: js.Any): Unit
  def startDoc(param: js.Any): Unit
  def startTag(name: String, attribs: js.Array[String], param: js.Any): Unit
}

object ISaxHandler {
  @scala.inline
  def apply(
    cdata: (String, js.Any) => Unit,
    comment: (String, js.Any) => Unit,
    endDoc: js.Any => Unit,
    endTag: (String, js.Any) => Unit,
    pcdata: (String, js.Any) => Unit,
    rcdata: (String, js.Any) => Unit,
    startDoc: js.Any => Unit,
    startTag: (String, js.Array[String], js.Any) => Unit
  ): ISaxHandler = {
    val __obj = js.Dynamic.literal(cdata = js.Any.fromFunction2(cdata), comment = js.Any.fromFunction2(comment), endDoc = js.Any.fromFunction1(endDoc), endTag = js.Any.fromFunction2(endTag), pcdata = js.Any.fromFunction2(pcdata), rcdata = js.Any.fromFunction2(rcdata), startDoc = js.Any.fromFunction1(startDoc), startTag = js.Any.fromFunction3(startTag))
    __obj.asInstanceOf[ISaxHandler]
  }
}

