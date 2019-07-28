package typings.prosemirrorDashTransform.prosemirrorDashTransformMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Mark
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "AddMarkStep")
@js.native
class AddMarkStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
  def this(from: Double, to: Double, mark: Mark[S]) = this()
}

