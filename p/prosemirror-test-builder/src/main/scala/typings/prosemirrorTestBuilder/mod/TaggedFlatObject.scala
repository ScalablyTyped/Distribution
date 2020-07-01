package typings.prosemirrorTestBuilder.mod

import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedFlatObject[S /* <: Schema[_, _] */] extends js.Object {
  var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]
  var tag: Record[String, Double]
}

object TaggedFlatObject {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedFlatObject[S]]
  }
}

