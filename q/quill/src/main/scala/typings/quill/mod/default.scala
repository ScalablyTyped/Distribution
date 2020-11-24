package typings.quill.mod

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("quill", JSImport.Default)
@js.native
class default protected () extends Quill {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: QuillOptionsStatic) = this()
  def this(container: Element, options: QuillOptionsStatic) = this()
}
/* static members */
@JSImport("quill", JSImport.Default)
@js.native
object default extends js.Object {
  
  // static methods: debug, import, register, find
  def debug(level: String): Unit = js.native
  def debug(level: Boolean): Unit = js.native
  
  def find(domNode: Node): Quill | js.Any = js.native
  def find(domNode: Node, bubble: Boolean): Quill | js.Any = js.native
  
  def `import`(path: String): js.Any = js.native
  
  def register(defs: StringMap): Unit = js.native
  def register(defs: StringMap, suppressWarning: Boolean): Unit = js.native
  def register(path: String, `def`: js.Any): Unit = js.native
  def register(path: String, `def`: js.Any, suppressWarning: Boolean): Unit = js.native
}
