package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXStream")
@js.native
class SAXStream ()
  extends nodeLib.streamMod.Duplex {
  def this(strict: scala.Boolean) = this()
  def this(strict: scala.Boolean, opt: SAXOptions) = this()
  var _parser: SAXParser = js.native
  def on(
    event: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  def on(
    event: js.Symbol,
    listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_attribute(
    event: saxLib.saxLibStrings.attribute,
    listener: js.ThisFunction1[/* this */ this.type, /* attr */ saxLib.Anon_Name, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cdata(
    event: saxLib.saxLibStrings.cdata,
    listener: js.ThisFunction1[/* this */ this.type, /* cdata */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: saxLib.saxLibStrings.close, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_closecdata(
    event: saxLib.saxLibStrings.closecdata,
    listener: js.ThisFunction0[/* this */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closenamespace(
    event: saxLib.saxLibStrings.closenamespace,
    listener: js.ThisFunction1[/* this */ this.type, /* ns */ saxLib.Anon_Prefix, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closetag(
    event: saxLib.saxLibStrings.closetag,
    listener: js.ThisFunction1[/* this */ this.type, /* tagName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_comment(
    event: saxLib.saxLibStrings.comment,
    listener: js.ThisFunction1[/* this */ this.type, /* comment */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_data(
    event: saxLib.saxLibStrings.data,
    listener: js.ThisFunction1[/* this */ this.type, /* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_doctype(
    event: saxLib.saxLibStrings.doctype,
    listener: js.ThisFunction1[/* this */ this.type, /* doctype */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drain(event: saxLib.saxLibStrings.drain, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: saxLib.saxLibStrings.end, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: saxLib.saxLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_finish(event: saxLib.saxLibStrings.finish, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_opencdata(
    event: saxLib.saxLibStrings.opencdata,
    listener: js.ThisFunction0[/* this */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_opennamespace(
    event: saxLib.saxLibStrings.opennamespace,
    listener: js.ThisFunction1[/* this */ this.type, /* ns */ saxLib.Anon_Prefix, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_opentag(
    event: saxLib.saxLibStrings.opentag,
    listener: js.ThisFunction1[/* this */ this.type, /* tag */ Tag | QualifiedTag, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: saxLib.saxLibStrings.pipe,
    listener: js.ThisFunction1[/* this */ this.type, /* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_processinginstruction(
    event: saxLib.saxLibStrings.processinginstruction,
    listener: js.ThisFunction1[/* this */ this.type, /* node */ saxLib.Anon_Body, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: saxLib.saxLibStrings.readable, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: saxLib.saxLibStrings.ready, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_script(
    event: saxLib.saxLibStrings.script,
    listener: js.ThisFunction1[/* this */ this.type, /* script */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_text(
    event: saxLib.saxLibStrings.text,
    listener: js.ThisFunction1[/* this */ this.type, /* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: saxLib.saxLibStrings.unpipe,
    listener: js.ThisFunction1[/* this */ this.type, /* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
}

