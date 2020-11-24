package typings.regexpp.visitorMod

import typings.regexpp.astMod.Node
import typings.regexpp.visitorMod.RegExpVisitor.Handlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexpp/visitor", "RegExpVisitor")
@js.native
class RegExpVisitor_ protected () extends js.Object {
  def this(handlers: Handlers) = this()
  
  def visit(node: Node): Unit = js.native
}
