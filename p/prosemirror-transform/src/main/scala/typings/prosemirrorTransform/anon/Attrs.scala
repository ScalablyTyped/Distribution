package typings.prosemirrorTransform.anon

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs[S /* <: Schema[_, _] */] extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var `type`: NodeType[S]
}

object Attrs {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](`type`: NodeType[S], attrs: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined): Attrs[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(attrs)) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs[S]]
  }
}

