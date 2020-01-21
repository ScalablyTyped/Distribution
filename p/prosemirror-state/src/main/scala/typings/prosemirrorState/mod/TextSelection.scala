package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "TextSelection")
@js.native
class TextSelection[S /* <: Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Construct a text selection between the given points.
    */
  def this($anchor: ResolvedPos[S]) = this()
  def this($anchor: ResolvedPos[S], $head: ResolvedPos[S]) = this()
  /**
    * Returns a resolved position if this is a cursor selection (an
    * empty text selection), and null otherwise.
    */
  @JSName("$cursor")
  var $cursor: js.UndefOr[ResolvedPos[S] | Null] = js.native
}

/* static members */
@JSImport("prosemirror-state", "TextSelection")
@js.native
object TextSelection extends js.Object {
  /**
    * Return a text selection that spans the given positions or, if
    * they aren't text positions, find a text selection near them.
    * `bias` determines whether the method searches forward (default)
    * or backwards (negative number) first. Will fall back to calling
    * [`Selection.near`](#state.Selection^near) when the document
    * doesn't contain a valid text position.
    */
  def between[S /* <: Schema[_, _] */]($anchor: ResolvedPos[S], $head: ResolvedPos[S]): Selection[S] = js.native
  def between[S /* <: Schema[_, _] */]($anchor: ResolvedPos[S], $head: ResolvedPos[S], bias: Double): Selection[S] = js.native
  /**
    * Create a text selection from non-resolved positions.
    */
  def create[S /* <: Schema[_, _] */](doc: Node[S], anchor: Double): TextSelection[S] = js.native
  def create[S /* <: Schema[_, _] */](doc: Node[S], anchor: Double, head: Double): TextSelection[S] = js.native
}

