package typings.saxes.mod

import typings.saxes.AnonBody
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saxes", "SaxesParser")
@js.native
class SaxesParser protected () extends js.Object {
  def this(opt: SaxesOptions) = this()
  val ENTITIES: Record[String, String] = js.native
  val closed: Boolean = js.native
  val column: Double = js.native
  val line: Double = js.native
  val opt: SaxesOptions = js.native
  val position: Double = js.native
  val xmlDecl: XMLDecl = js.native
  def close(): this.type = js.native
  def fail(er: Error): this.type = js.native
  def oncdata(cdata: String): Unit = js.native
  def onclosetag(tag: SaxesTag): Unit = js.native
  def oncomment(comment: String): Unit = js.native
  def ondoctype(doctype: String): Unit = js.native
  def onend(): Unit = js.native
  def onerror(err: Error): Unit = js.native
  def onopentag(tag: SaxesTag): Unit = js.native
  def onopentagstart(tag: SaxesTag): Unit = js.native
  def onprocessinginstruction(pi: AnonBody): Unit = js.native
  def onready(): Unit = js.native
  def ontext(text: String): Unit = js.native
  def resolve(prefix: String): js.UndefOr[String] = js.native
  def write(): this.type = js.native
  def write(chunk: String): this.type = js.native
}

