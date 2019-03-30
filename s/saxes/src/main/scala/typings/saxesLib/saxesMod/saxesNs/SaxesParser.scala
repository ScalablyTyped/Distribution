package typings
package saxesLib.saxesMod.saxesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaxesParser extends js.Object {
  val ENTITIES: stdLib.Record[java.lang.String, java.lang.String] = js.native
  val closed: scala.Boolean = js.native
  val column: scala.Double = js.native
  val line: scala.Double = js.native
  val opt: SaxesOptions = js.native
  val position: scala.Double = js.native
  val xmlDecl: XMLDecl = js.native
  def close(): this.type = js.native
  def fail(er: stdLib.Error): this.type = js.native
  def oncdata(cdata: java.lang.String): scala.Unit = js.native
  def onclosetag(tag: SaxesTag): scala.Unit = js.native
  def oncomment(comment: java.lang.String): scala.Unit = js.native
  def ondoctype(doctype: java.lang.String): scala.Unit = js.native
  def onend(): scala.Unit = js.native
  def onerror(err: stdLib.Error): scala.Unit = js.native
  def onopentag(tag: SaxesTag): scala.Unit = js.native
  def onopentagstart(tag: SaxesTag): scala.Unit = js.native
  def onprocessinginstruction(pi: saxesLib.Anon_Body): scala.Unit = js.native
  def onready(): scala.Unit = js.native
  def ontext(text: java.lang.String): scala.Unit = js.native
  def resolve(prefix: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def write(): this.type = js.native
  def write(chunk: java.lang.String): this.type = js.native
}

