package typings.remotedevSerialize

import typings.remotedevSerialize.anon.Parse
import typings.remotedevSerialize.anon.TypeofImmutable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remotedev-serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def immutable(immutable: TypeofImmutable): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Unit, customReplacer: Unit, customReviver: Reviver): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any], customReviver.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Unit, customReplacer: Replacer): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Unit, customReplacer: Replacer, customReviver: Reviver): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any], customReviver.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Refs): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Unit, customReviver: Reviver): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any], customReviver.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(immutable.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], customReplacer.asInstanceOf[js.Any], customReviver.asInstanceOf[js.Any])).asInstanceOf[Parse]
  
  type DefaultReplacer = js.Function2[/* key */ String, /* value */ Any, Any]
  
  type DefaultReviver = js.Function2[/* key */ String, /* value */ Any, Any]
  
  type Options = Record[String, Boolean]
  
  type Refs = Record[String, Any]
  
  type Replacer = js.Function3[/* key */ String, /* value */ Any, /* replacer */ DefaultReplacer, Any]
  
  type Reviver = js.Function3[/* key */ String, /* value */ Any, /* reviver */ DefaultReviver, Any]
}
