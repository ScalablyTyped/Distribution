package typings.remotedevSerialize

import typings.remotedevSerialize.anon.Parse
import typings.remotedevSerialize.anon.TypeofImmutable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(immutable: TypeofImmutable): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: js.UndefOr[scala.Nothing],
    customReplacer: js.UndefOr[scala.Nothing],
    customReviver: Reviver
  ): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(immutable: TypeofImmutable, refs: js.UndefOr[scala.Nothing], customReplacer: Replacer): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: js.UndefOr[scala.Nothing],
    customReplacer: Replacer,
    customReviver: Reviver
  ): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(immutable: TypeofImmutable, refs: Refs): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: Refs,
    customReplacer: js.UndefOr[scala.Nothing],
    customReviver: Reviver
  ): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Parse = js.native
  @JSImport("remotedev-serialize", "immutable")
  @js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Parse = js.native
  
  type DefaultReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  type DefaultReviver = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  type Options = Record[String, Boolean]
  
  type Refs = Record[String, js.Any]
  
  type Replacer = js.Function3[/* key */ String, /* value */ js.Any, /* replacer */ DefaultReplacer, js.Any]
  
  type Reviver = js.Function3[/* key */ String, /* value */ js.Any, /* reviver */ DefaultReviver, js.Any]
}
