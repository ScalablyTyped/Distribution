package typings.stampit.mod.stampit

import typings.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Initializer` function context.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
  */
trait InitializerContext[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** An array of the arguments passed into the `Stamp`, including the options argument. */
  // ! above description from the specification is obscure
  var args: js.Array[_]
  /** The object instance being produced by the `Stamp`. If the initializer returns a value other than `undefined`, it replaces the instance. */
  var instance: Obj
  /** A reference to the `Stamp` producing the instance. */
  var stamp: S̤t̤a̤m̤p̤
}

object InitializerContext {
  @scala.inline
  def apply[Obj, /* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤](args: js.Array[_], instance: Obj, stamp: S̤t̤a̤m̤p̤): InitializerContext[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializerContext[Obj, S̤t̤a̤m̤p̤]]
  }
}

