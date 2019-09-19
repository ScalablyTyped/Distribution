package typings.relayDashCompiler.libCoreGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpread
  extends IR
     with Selection {
  var args: js.Array[Argument]
  var directives: js.Array[Directive]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.FragmentSpread
  var loc: Location
  var metadata: Metadata
  var name: String
}

object FragmentSpread {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.FragmentSpread,
    loc: Location,
    metadata: Metadata,
    name: String
  ): FragmentSpread = {
    val __obj = js.Dynamic.literal(args = args, directives = directives, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[FragmentSpread]
  }
}

