package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quill", JSImport.Default)
@js.native
class default protected () extends Quill {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  def this(container: java.lang.String, options: QuillOptionsStatic) = this()
  def this(container: stdLib.Element, options: QuillOptionsStatic) = this()
}

@JSImport("quill", JSImport.Default)
@js.native
object default extends js.Object {
  // static methods: debug, import, register, find
  def debug(level: java.lang.String): scala.Unit = js.native
  // static methods: debug, import, register, find
  def debug(level: scala.Boolean): scala.Unit = js.native
  def find(domNode: stdLib.Node): quillLib.quillMod.Quill | js.Any = js.native
  def find(domNode: stdLib.Node, bubble: scala.Boolean): quillLib.quillMod.Quill | js.Any = js.native
  def `import`(path: java.lang.String): js.Any = js.native
  def register(defs: quillLib.quillMod.StringMap): scala.Unit = js.native
  def register(defs: quillLib.quillMod.StringMap, suppressWarning: scala.Boolean): scala.Unit = js.native
  def register(path: java.lang.String, `def`: js.Any): scala.Unit = js.native
  def register(path: java.lang.String, `def`: js.Any, suppressWarning: scala.Boolean): scala.Unit = js.native
}

