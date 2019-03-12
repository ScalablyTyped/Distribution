package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXParser")
@js.native
class SAXParser protected () extends js.Object {
  def this(strict: scala.Boolean) = this()
  def this(strict: scala.Boolean, opt: SAXOptions) = this()
  var ENTITIES: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var closed: scala.Boolean = js.native
  var column: scala.Double = js.native
  var error: stdLib.Error = js.native
  // Members
  var line: scala.Double = js.native
  var opt: SAXOptions = js.native
  var position: scala.Double = js.native
  var startTagPosition: scala.Double = js.native
  var strict: scala.Boolean = js.native
  var tag: java.lang.String = js.native
  def close(): SAXParser = js.native
  // Methods
  def end(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def onattribute(attr: saxLib.Anon_Name): scala.Unit = js.native
  def oncdata(cdata: java.lang.String): scala.Unit = js.native
  def onclosecdata(): scala.Unit = js.native
  def onclosenamespace(ns: saxLib.Anon_Prefix): scala.Unit = js.native
  def onclosetag(tagName: java.lang.String): scala.Unit = js.native
  def oncomment(comment: java.lang.String): scala.Unit = js.native
  def ondoctype(doctype: java.lang.String): scala.Unit = js.native
  def onend(): scala.Unit = js.native
  // Events
  def onerror(e: stdLib.Error): scala.Unit = js.native
  def onopencdata(): scala.Unit = js.native
  def onopennamespace(ns: saxLib.Anon_Prefix): scala.Unit = js.native
  def onopentag(tag: QualifiedTag): scala.Unit = js.native
  def onopentag(tag: Tag): scala.Unit = js.native
  def onprocessinginstruction(node: saxLib.Anon_Body): scala.Unit = js.native
  def onready(): scala.Unit = js.native
  def onscript(script: java.lang.String): scala.Unit = js.native
  def ontext(t: java.lang.String): scala.Unit = js.native
  def resume(): SAXParser = js.native
  def write(s: java.lang.String): SAXParser = js.native
}

