package typings.stampit.mod

import typings.stampit.mod.stampit.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @internal Signature common to every `Stamp`s. */
@js.native
trait StampSignature extends js.Object {
  var compose: ComposeMethod with (Descriptor[_, _]) = js.native
  def apply(): js.Any = js.native
  def apply(options: PropertyMap, args: js.Any*): js.Any = js.native
}

