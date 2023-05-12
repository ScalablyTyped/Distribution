package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends (x : any, args : infer P): infer R ? (args : P): R : never
    }}}
    */
  @js.native
  trait OmitFirstArg[F] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends (x : any, args : infer P): infer R ? (args : P): R : never
    }}}
    */
  @js.native
  trait OmitFirstArgWithSpecificGeneric[F, TSpecific] extends StObject
  
  type WithEditorFirstArg[T /* <: js.Function1[/* args */ Any, Any] */] = js.Function2[/* editor */ Editor, /* args */ Parameters[T], ReturnType[T]]
}
