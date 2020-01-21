package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "Mark")
@js.native
class Mark[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The attributes associated with this mark.
    */
  var attrs: StringDictionary[js.Any] = js.native
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
  def eq(other: Mark[S]): Boolean = js.native
  /**
    * Test whether this mark is in the given set of marks.
    */
  def isInSet(set: js.Array[Mark[S]]): Boolean = js.native
  /**
    * Remove this mark from the given set, returning a new set. If this
    * mark is not in the set, the set itself is returned.
    */
  def removeFromSet(set: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  /**
    * Convert this mark to a JSON-serializeable representation.
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("prosemirror-model", "Mark")
@js.native
object Mark extends js.Object {
  /**
    * The empty set of marks.
    */
  var none: js.Array[Mark[_]] = js.native
  def fromJSON[S /* <: Schema[_, _] */](schema: S, json: StringDictionary[js.Any]): Mark[S] = js.native
  /**
    * Test whether two sets of marks are identical.
    */
  def sameSet[S /* <: Schema[_, _] */](a: js.Array[Mark[S]], b: js.Array[Mark[S]]): Boolean = js.native
  /**
    * Create a properly sorted mark set from null, a single mark, or an
    * unsorted array of marks.
    */
  def setFrom[S /* <: Schema[_, _] */](): js.Array[Mark[S]] = js.native
  def setFrom[S /* <: Schema[_, _] */](marks: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  def setFrom[S /* <: Schema[_, _] */](marks: Mark[S]): js.Array[Mark[S]] = js.native
}

