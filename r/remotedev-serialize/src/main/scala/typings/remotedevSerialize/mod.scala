package typings.remotedevSerialize

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remotedev-serialize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def immutable(immutable: TypeofImmutable): AnonCustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs): AnonCustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): AnonCustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): AnonCustomReplacer = js.native
  type DefaultReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type DefaultReviver = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Options = Record[String, Boolean]
  type Refs = Record[String, js.Any]
  type Replacer = js.Function3[/* key */ String, /* value */ js.Any, /* replacer */ DefaultReplacer, js.Any]
  type Reviver = js.Function3[/* key */ String, /* value */ js.Any, /* reviver */ DefaultReviver, js.Any]
}

