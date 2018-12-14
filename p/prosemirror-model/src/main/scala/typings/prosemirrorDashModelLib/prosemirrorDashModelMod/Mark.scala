package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "Mark")
@js.native
class Mark[S /* <: Schema[_, _] */] () extends js.Object {
  /**
     * The attributes associated with this mark.
     */
  var attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
     * The type of this mark.
     */
  var `type`: MarkType[S] = js.native
  /**
     * Given a set of marks, create a new set which contains this one as
     * well, in the right position. If this mark is already in the set,
     * the set itself is returned. If any marks that are set to be
     * [exclusive](#model.MarkSpec.excludes) with this mark are present,
     * those are replaced by this one.
     */
  def addToSet(set: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  /**
     * Test whether this mark has the same type and attributes as
     * another mark.
     */
  def eq(other: Mark[S]): scala.Boolean = js.native
  /**
     * Test whether this mark is in the given set of marks.
     */
  def isInSet(set: js.Array[Mark[S]]): scala.Boolean = js.native
  /**
     * Remove this mark from the given set, returning a new set. If this
     * mark is not in the set, the set itself is returned.
     */
  def removeFromSet(set: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  /**
     * Convert this mark to a JSON-serializeable representation.
     */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("prosemirror-model", "Mark")
@js.native
object Mark extends js.Object {
  /**
     * The empty set of marks.
     */
  var none: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] = js.native
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S, json: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S] = js.native
  /**
     * Test whether two sets of marks are identical.
     */
  def sameSet[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    a: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]],
    b: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]]
  ): scala.Boolean = js.native
  /**
     * Create a properly sorted mark set from null, a single mark, or an
     * unsorted array of marks.
     */
  def setFrom[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](): js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]] = js.native
  /**
     * Create a properly sorted mark set from null, a single mark, or an
     * unsorted array of marks.
     */
  def setFrom[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](marks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]]): js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]] = js.native
  /**
     * Create a properly sorted mark set from null, a single mark, or an
     * unsorted array of marks.
     */
  def setFrom[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](marks: prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]): js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]] = js.native
}

