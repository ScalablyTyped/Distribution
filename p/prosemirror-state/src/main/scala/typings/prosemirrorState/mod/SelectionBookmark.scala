package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.mod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBookmark[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Map the bookmark through a set of changes.
    */
  def map(mapping: Mapping): SelectionBookmark[S]
  /**
    * Resolve the bookmark to a real selection again. This may need to
    * do some error checking and may fall back to a default (usually
    * [`TextSelection.between`](#state.TextSelection^between)) if
    * mapping made the bookmark invalid.
    */
  def resolve(doc: Node[S]): Selection[S]
}

object SelectionBookmark {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](map: Mapping => SelectionBookmark[S], resolve: Node[S] => Selection[S]): SelectionBookmark[S] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[SelectionBookmark[S]]
  }
}

