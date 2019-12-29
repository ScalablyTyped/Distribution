package typings.remotedevDashSerialize

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remotedev-serialize", JSImport.Namespace)
@js.native
object remotedevDashSerializeMod extends js.Object {
  def immutable(immutable: TypeofImmutable): Anon_CustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs): Anon_CustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Anon_CustomReplacer = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Anon_CustomReplacer = js.native
  type DefaultReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type DefaultReviver = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Options = Record[String, Boolean]
  type Refs = Record[String, js.Any]
  type Replacer = js.Function3[/* key */ String, /* value */ js.Any, /* replacer */ DefaultReplacer, js.Any]
  type Reviver = js.Function3[/* key */ String, /* value */ js.Any, /* reviver */ DefaultReviver, js.Any]
}

