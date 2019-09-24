package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive
  extends IR
     with VisitNode {
  var args: js.Array[Argument]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Directive
  var loc: Location
  var metadata: Metadata
  var name: String
}

object Directive {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Directive,
    loc: Location,
    metadata: Metadata,
    name: String
  ): Directive = {
    val __obj = js.Dynamic.literal(args = args, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[Directive]
  }
}

