package typings.relayDashCompiler.libGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends GeneratedDefinition
     with IR {
  var fragment: Fragment
  var id: js.UndefOr[String] = js.undefined
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Request
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
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Request,
    loc: Location,
    metadata: Metadata,
    name: String,
    root: Root,
    id: String = null,
    text: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(fragment = fragment, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, root = root)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Request]
  }
}

