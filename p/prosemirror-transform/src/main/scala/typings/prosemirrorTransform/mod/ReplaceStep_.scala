package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "ReplaceStep")
@js.native
class ReplaceStep_[S /* <: Schema[_, _] */] protected () extends Step[S] {
  /**
    * The given `slice` should fit the 'gap' between `from` and
    * `to`—the depths must line up, and the surrounding nodes must be
    * able to be joined with the open sides of the slice. When
    * `structure` is true, the step will fail if the content between
    * from and to is not just a sequence of closing and then opening
    * tokens (this is to guard against rebased replace steps
    * overwriting something they weren't supposed to).
    */
  def this(from: Double, to: Double, slice: Slice[S]) = this()
  def this(from: Double, to: Double, slice: Slice[S], structure: Boolean) = this()
}
