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
    cdata: js.Function2[java.lang.String, js.Any, scala.Unit],
    comment: js.Function2[java.lang.String, js.Any, scala.Unit],
    endDoc: js.Function1[js.Any, scala.Unit],
    endTag: js.Function2[java.lang.String, js.Any, scala.Unit],
    pcdata: js.Function2[java.lang.String, js.Any, scala.Unit],
    rcdata: js.Function2[java.lang.String, js.Any, scala.Unit],
    startDoc: js.Function1[js.Any, scala.Unit],
    startTag: js.Function3[java.lang.String, js.Array[java.lang.String], js.Any, scala.Unit]
  ): ISaxHandler = {
    val __obj = js.Dynamic.literal(cdata = cdata, comment = comment, endDoc = endDoc, endTag = endTag, pcdata = pcdata, rcdata = rcdata, startDoc = startDoc, startTag = startTag)
  
    __obj.asInstanceOf[ISaxHandler]
  }
}

