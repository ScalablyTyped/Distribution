package typings.saxes.anon

import typings.saxes.mod.AttributeEventForOptions
import typings.saxes.mod.AttributeHandler
import typings.saxes.mod.CDataHandler
import typings.saxes.mod.CloseTagHandler
import typings.saxes.mod.CommentHandler
import typings.saxes.mod.DoctypeHandler
import typings.saxes.mod.EndHandler
import typings.saxes.mod.ErrorHandler
import typings.saxes.mod.OpenTagHandler
import typings.saxes.mod.OpenTagStartHandler
import typings.saxes.mod.PIHandler
import typings.saxes.mod.ReadyHandler
import typings.saxes.mod.StartTagForOptions
import typings.saxes.mod.TagForOptions
import typings.saxes.mod.TextHandler
import typings.saxes.mod.XMLDecl
import typings.saxes.mod.XMLDeclHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute[O] extends js.Object {
  @JSName("attribute")
  var attribute_Original: AttributeHandler[O] = js.native
  @JSName("cdata")
  var cdata_Original: CDataHandler = js.native
  @JSName("closetag")
  var closetag_Original: CloseTagHandler[O] = js.native
  @JSName("comment")
  var comment_Original: CommentHandler = js.native
  @JSName("doctype")
  var doctype_Original: DoctypeHandler = js.native
  @JSName("end")
  var end_Original: EndHandler = js.native
  @JSName("error")
  var error_Original: ErrorHandler = js.native
  @JSName("opentag")
  var opentag_Original: OpenTagHandler[O] = js.native
  @JSName("opentagstart")
  var opentagstart_Original: OpenTagStartHandler[O] = js.native
  @JSName("processinginstruction")
  var processinginstruction_Original: PIHandler = js.native
  @JSName("ready")
  var ready_Original: ReadyHandler = js.native
  @JSName("text")
  var text_Original: TextHandler = js.native
  @JSName("xmldecl")
  var xmldecl_Original: XMLDeclHandler = js.native
  def attribute(attribute: AttributeEventForOptions[O]): Unit = js.native
  def cdata(cdata: String): Unit = js.native
  def closetag(tag: TagForOptions[O]): Unit = js.native
  def comment(comment: String): Unit = js.native
  def doctype(doctype: String): Unit = js.native
  def end(): Unit = js.native
  def error(err: Error): Unit = js.native
  def opentag(tag: TagForOptions[O]): Unit = js.native
  def opentagstart(tag: StartTagForOptions[O]): Unit = js.native
  def processinginstruction(data: Body): Unit = js.native
  def ready(): Unit = js.native
  def text(text: String): Unit = js.native
  def xmldecl(decl: XMLDecl): Unit = js.native
}

