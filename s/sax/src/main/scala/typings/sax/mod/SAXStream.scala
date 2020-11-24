package typings.sax.mod

import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.sax.anon.Body
import typings.sax.anon.Name
import typings.sax.anon.Prefix
import typings.sax.saxStrings.attribute
import typings.sax.saxStrings.cdata
import typings.sax.saxStrings.close
import typings.sax.saxStrings.closecdata
import typings.sax.saxStrings.closenamespace
import typings.sax.saxStrings.closetag
import typings.sax.saxStrings.comment
import typings.sax.saxStrings.data
import typings.sax.saxStrings.doctype
import typings.sax.saxStrings.drain
import typings.sax.saxStrings.end
import typings.sax.saxStrings.error
import typings.sax.saxStrings.finish
import typings.sax.saxStrings.opencdata
import typings.sax.saxStrings.opennamespace
import typings.sax.saxStrings.opentag
import typings.sax.saxStrings.pipe
import typings.sax.saxStrings.processinginstruction
import typings.sax.saxStrings.readable
import typings.sax.saxStrings.ready
import typings.sax.saxStrings.script
import typings.sax.saxStrings.text
import typings.sax.saxStrings.unpipe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sax", "SAXStream")
@js.native
class SAXStream () extends Duplex {
  def this(strict: Boolean) = this()
  def this(strict: js.UndefOr[scala.Nothing], opt: SAXOptions) = this()
  def this(strict: Boolean, opt: SAXOptions) = this()
  
  var _parser: SAXParser = js.native
  
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_attribute(event: attribute, listener: js.ThisFunction1[/* this */ this.type, /* attr */ Name, Unit]): this.type = js.native
  @JSName("on")
  def on_cdata(event: cdata, listener: js.ThisFunction1[/* this */ this.type, /* cdata */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closecdata(event: closecdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closenamespace(event: closenamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ Prefix, Unit]): this.type = js.native
  @JSName("on")
  def on_closetag(event: closetag, listener: js.ThisFunction1[/* this */ this.type, /* tagName */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_comment(event: comment, listener: js.ThisFunction1[/* this */ this.type, /* comment */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.ThisFunction1[/* this */ this.type, /* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_doctype(event: doctype, listener: js.ThisFunction1[/* this */ this.type, /* doctype */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opencdata(event: opencdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opennamespace(event: opennamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ Prefix, Unit]): this.type = js.native
  @JSName("on")
  def on_opentag(
    event: opentag,
    listener: js.ThisFunction1[/* this */ this.type, /* tag */ Tag | QualifiedTag, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_processinginstruction(
    event: processinginstruction,
    listener: js.ThisFunction1[/* this */ this.type, /* node */ Body, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_script(event: script, listener: js.ThisFunction1[/* this */ this.type, /* script */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_text(event: text, listener: js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
}
