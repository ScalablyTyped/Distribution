package typings.stampit.mod.stampit

import typings.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters received by the current `.composers` function.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
  */
trait ComposerParameters[S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** The list of composables the `Stamp` was just composed of. */
  var composables: js.Array[Composable]
  /** The result of the `Composable`s composition. */
  var stamp: S̤t̤a̤m̤p̤
}

object ComposerParameters {
  @scala.inline
  def apply[/* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤](composables: js.Array[Composable], stamp: S̤t̤a̤m̤p̤): ComposerParameters[S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(composables = composables.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerParameters[S̤t̤a̤m̤p̤]]
  }
}

