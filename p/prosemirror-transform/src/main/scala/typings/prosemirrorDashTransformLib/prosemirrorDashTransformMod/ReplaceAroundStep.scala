package typings
package prosemirrorDashTransformLib.prosemirrorDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "ReplaceAroundStep")
@js.native
class ReplaceAroundStep[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends Step[S] {
  /**
     * Create a replace-around step with the given range and gap.
     * `insert` should be the point in the slice into which the content
     * of the gap should be moved. `structure` has the same meaning as
     * it has in the [`ReplaceStep`](#transform.ReplaceStep) class.
     */
  def this(from: scala.Double, to: scala.Double, gapFrom: scala.Double, gapTo: scala.Double, slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], insert: scala.Double) = this()
  /**
     * Create a replace-around step with the given range and gap.
     * `insert` should be the point in the slice into which the content
     * of the gap should be moved. `structure` has the same meaning as
     * it has in the [`ReplaceStep`](#transform.ReplaceStep) class.
     */
  def this(from: scala.Double, to: scala.Double, gapFrom: scala.Double, gapTo: scala.Double, slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], insert: scala.Double, structure: scala.Boolean) = this()
}

