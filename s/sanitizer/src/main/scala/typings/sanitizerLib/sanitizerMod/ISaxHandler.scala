package typings
package sanitizerLib.sanitizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISaxHandler extends js.Object {
  def cdata(text: java.lang.String, param: js.Any): scala.Unit
  def comment(text: java.lang.String, param: js.Any): scala.Unit
  def endDoc(param: js.Any): scala.Unit
  def endTag(name: java.lang.String, param: js.Any): scala.Unit
  def pcdata(text: java.lang.String, param: js.Any): scala.Unit
  def rcdata(text: java.lang.String, param: js.Any): scala.Unit
  def startDoc(param: js.Any): scala.Unit
  def startTag(name: java.lang.String, attribs: js.Array[java.lang.String], param: js.Any): scala.Unit
}

object ISaxHandler {
  @scala.inline
  def apply(
    cdata: (java.lang.String, js.Any) => scala.Unit,
    comment: (java.lang.String, js.Any) => scala.Unit,
    endDoc: js.Any => scala.Unit,
    endTag: (java.lang.String, js.Any) => scala.Unit,
    pcdata: (java.lang.String, js.Any) => scala.Unit,
    rcdata: (java.lang.String, js.Any) => scala.Unit,
    startDoc: js.Any => scala.Unit,
    startTag: (java.lang.String, js.Array[java.lang.String], js.Any) => scala.Unit
  ): ISaxHandler = {
    val __obj = js.Dynamic.literal(cdata = js.Any.fromFunction2(cdata), comment = js.Any.fromFunction2(comment), endDoc = js.Any.fromFunction1(endDoc), endTag = js.Any.fromFunction2(endTag), pcdata = js.Any.fromFunction2(pcdata), rcdata = js.Any.fromFunction2(rcdata), startDoc = js.Any.fromFunction1(startDoc), startTag = js.Any.fromFunction3(startTag))
  
    __obj.asInstanceOf[ISaxHandler]
  }
}

