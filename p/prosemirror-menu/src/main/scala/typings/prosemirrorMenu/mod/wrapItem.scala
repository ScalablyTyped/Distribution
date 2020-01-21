package typings.prosemirrorMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "wrapItem")
@js.native
object wrapItem extends js.Object {
  def apply[S /* <: Schema[_, _] */](nodeType: NodeType[S], options: StringDictionary[js.Any]): MenuItem[S] = js.native
}

