package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends GeneratedDefinition
     with IR
     with VisitNode {
  var fragment: Fragment
  var id: js.UndefOr[String] = js.undefined
  var kind: typings.relayCompiler.relayCompilerStrings.Request
  var loc: Location
  var metadata: Metadata
  var name: String
  var root: Root
  var text: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    fragment: Fragment,
    kind: typings.relayCompiler.relayCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root,
    id: String = null,
    metadata: Metadata = null,
    text: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

