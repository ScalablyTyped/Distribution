package typings.prosemirrorDashTransform.prosemirrorDashTransformMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "StepResult")
@js.native
class StepResult[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The transformed document.
    */
  var doc: js.UndefOr[Node[S] | Null] = js.native
  /**
    * Text providing information about a failed step.
    */
  var failed: js.UndefOr[String | Null] = js.native
}

/* static members */
@JSImport("prosemirror-transform", "StepResult")
@js.native
object StepResult extends js.Object {
  /**
    * Create a failed step result.
    */
  def fail(message: String): StepResult[_] = js.native
  /**
    * Call [`Node.replace`](#model.Node.replace) with the given
    * arguments. Create a successful result if it succeeds, and a
    * failed one if it throws a `ReplaceError`.
    */
  def fromReplace[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): StepResult[S] = js.native
  /**
    * Create a successful step result.
    */
  def ok[S /* <: Schema[_, _] */](doc: Node[S]): StepResult[S] = js.native
}

