package typings
package prosemirrorDashTransformLib.prosemirrorDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "StepResult")
@js.native
class StepResult[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] () extends js.Object {
  /**
    * The transformed document.
    */
  var doc: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] | scala.Null] = js.native
  /**
    * Text providing information about a failed step.
    */
  var failed: js.UndefOr[java.lang.String | scala.Null] = js.native
}

/* static members */
@JSImport("prosemirror-transform", "StepResult")
@js.native
object StepResult extends js.Object {
  /**
    * Create a failed step result.
    */
  def fail(message: java.lang.String): prosemirrorDashTransformLib.prosemirrorDashTransformMod.StepResult[_] = js.native
  /**
    * Call [`Node.replace`](#model.Node.replace) with the given
    * arguments. Create a successful result if it succeeds, and a
    * failed one if it throws a `ReplaceError`.
    */
  def fromReplace[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    from: scala.Double,
    to: scala.Double,
    slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): prosemirrorDashTransformLib.prosemirrorDashTransformMod.StepResult[S] = js.native
  /**
    * Create a successful step result.
    */
  def ok[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): prosemirrorDashTransformLib.prosemirrorDashTransformMod.StepResult[S] = js.native
}

