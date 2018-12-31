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

