package typings.stampit.mod.stampit

import typings.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters received by the current `.composers` function.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
  */
@js.native
trait ComposerParameters[S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** The list of composables the `Stamp` was just composed of. */
  var composables: js.Array[Composable] = js.native
  /** The result of the `Composable`s composition. */
  var stamp: S̤t̤a̤m̤p̤ = js.native
}

object ComposerParameters {
  @scala.inline
  def apply[/* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤](composables: js.Array[Composable], stamp: S̤t̤a̤m̤p̤): ComposerParameters[S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(composables = composables.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerParameters[S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class ComposerParametersOps[Self <: ComposerParameters[_], /* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤] (val x: Self with ComposerParameters[S̤t̤a̤m̤p̤]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComposablesVarargs(value: Composable*): Self = this.set("composables", js.Array(value :_*))
    @scala.inline
    def setComposables(value: js.Array[Composable]): Self = this.set("composables", value.asInstanceOf[js.Any])
    @scala.inline
    def setStamp(value: S̤t̤a̤m̤p̤): Self = this.set("stamp", value.asInstanceOf[js.Any])
  }
  
}

