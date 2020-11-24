package typings.stampit.mod

import typings.stampit.mod.stampit.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal Signature common to every `Stamp`s. */
@js.native
trait StampSignature extends js.Object {
  
  def apply(options: js.UndefOr[scala.Nothing], args: js.Any*): js.Any = js.native
  def apply(options: PropertyMap, args: js.Any*): js.Any = js.native
  
  var compose: ComposeMethod with (Descriptor[_, _]) = js.native
}
