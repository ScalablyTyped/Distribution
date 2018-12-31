package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "TextSelection")
@js.native
class TextSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Construct a text selection between the given points.
    */
  def this($anchor: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  def this($anchor: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], $head: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  /**
    * Returns a resolved position if this is a cursor selection (an
    * empty text selection), and null otherwise.
    */
  @JSName("$cursor")
  var $cursor: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] | scala.Null] = js.native
}

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
  def between[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    $anchor: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    $head: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.Selection[S] = js.native
  def between[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    $anchor: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    $head: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    bias: scala.Double
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.Selection[S] = js.native
  /**
    * Create a text selection from non-resolved positions.
    */
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], anchor: scala.Double): prosemirrorDashStateLib.prosemirrorDashStateMod.TextSelection[S] = js.native
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    anchor: scala.Double,
    head: scala.Double
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.TextSelection[S] = js.native
}

