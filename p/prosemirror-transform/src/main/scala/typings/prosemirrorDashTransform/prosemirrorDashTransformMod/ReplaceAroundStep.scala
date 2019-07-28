package typings.prosemirrorDashTransform.prosemirrorDashTransformMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "ReplaceAroundStep")
@js.native
class ReplaceAroundStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
  /**
    * Create a replace-around step with the given range and gap.
    * `insert` should be the point in the slice into which the content
    * of the gap should be moved. `structure` has the same meaning as
    * it has in the [`ReplaceStep`](#transform.ReplaceStep) class.
    */
  def this(from: Double, to: Double, gapFrom: Double, gapTo: Double, slice: Slice[S], insert: Double) = this()
  def this(
    from: Double,
    to: Double,
    gapFrom: Double,
    gapTo: Double,
    slice: Slice[S],
    insert: Double,
    structure: Boolean
  ) = this()
}

