package typings.prosemirrorTransform

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrs[S /* <: Schema[_, _] */] extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var `type`: NodeType[S]
}

object AnonAttrs {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](`type`: NodeType[S], attrs: StringDictionary[js.Any] = null): AnonAttrs[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs[S]]
  }
}

