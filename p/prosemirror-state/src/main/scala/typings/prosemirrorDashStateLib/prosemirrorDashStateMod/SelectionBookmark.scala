package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBookmark[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  /**
    * Map the bookmark through a set of changes.
    */
  def map(mapping: prosemirrorDashTransformLib.prosemirrorDashTransformMod.Mapping): SelectionBookmark[S]
  /**
    * Resolve the bookmark to a real selection again. This may need to
    * do some error checking and may fall back to a default (usually
    * [`TextSelection.between`](#state.TextSelection^between)) if
    * mapping made the bookmark invalid.
    */
  def resolve(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): Selection[S]
}

object SelectionBookmark {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    map: js.Function1[
      prosemirrorDashTransformLib.prosemirrorDashTransformMod.Mapping, 
      SelectionBookmark[S]
    ],
    resolve: js.Function1[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], Selection[S]]
  ): SelectionBookmark[S] = {
    val __obj = js.Dynamic.literal(map = map, resolve = resolve)
  
    __obj.asInstanceOf[SelectionBookmark[S]]
  }
}

